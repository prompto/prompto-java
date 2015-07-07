var SyntaxError = require("../error/SyntaxError").SyntaxError;
var DictType = require("../type/DictType").DictType;
var TextType = require("../type/TextType").TextType;
var ArgumentAssignment = require("../grammar/ArgumentAssignment").ArgumentAssignment;
var ArgumentAssignmentList = require("../grammar/ArgumentAssignmentList").ArgumentAssignmentList;
var UnresolvedArgument = require("../grammar/UnresolvedArgument").UnresolvedArgument;
var DictLiteral = require("../literal/DictLiteral").DictLiteral;
var MethodCall = require("../statement/MethodCall").MethodCall;
var MethodSelector = require("../expression/MethodSelector").MethodSelector;

var argsType = new DictType(TextType.instance);

function parseCmdLineArgs(cmdLineArgs) {
	try {
		var args = CmdLineParser.parse(cmdLineArgs);
		var valueArgs = {};
		var keys = Object.keys(args);
		for(var i=0;i<keys.length;i++) {
			var key = new Text(keys[i]);
			var value = new Text(args[keys[i]]);
			valueArgs[key] = value;
		}
		var dict = new Dictionary(valueArgs);
		return new ExpressionValue(argsType, dict);
	} catch(e) {
		// TODO
		return new DictLiteral();
	}
}

function buildAssignments(method, cmdLineArgs) {
	var assignments = new ArgumentAssignmentList();
	if(method.args.length==1) {
		var name = method.args[0].name;
		var value = parseCmdLineArgs(cmdLineArgs);
		assignments.add(new ArgumentAssignment(new UnresolvedArgument(name), value));
	}
	return assignments;
}


function locateMethod(context, methodName, cmdLineArgs) {
	var map = context.getRegisteredDeclaration(methodName);
	if(map==null) {
		throw new SyntaxError("Could not find a \"" + methodName + "\" method.");
	}
	return locateMethodInMap(map, cmdLineArgs);
}

function locateMethodInMap(map, cmdLineArgs) {
	if(cmdLineArgs==null || cmdLineArgs.length==0) {
		return locateMethodWithArgs(map);
	} else {
		return locateMethodWithArgs(map, new DictType(TextType.instance));
	}
}

function locateMethodWithArgs(map) {
	// try exact match first
	var keys = Object.keys(map.methods);
	for(var i=0;i<keys.length;i++) {
		var method = map.methods[keys[i]];
		if(identicalArguments(method.args, arguments)) {
			return method;
		}
	}
	// match Text{} argument, will pass null
	if(arguments.length==1) {
		for (var i = 0; i < keys.length; i++) {
			var method = map.methods[keys[i]];
			if (isSingleTextDictArgument(method.args)) {
				return method;
			}
		}
	}
	// match no argument, will ignore options
	for (var i = 0; i < keys.length; i++) {
		var method = map.methods[keys[i]];
		if(method.args.length==0) {
			return method;
		}
	}
	throw new SyntaxError("Could not find a compatible \"" + map.name + "\" method.");
}

function isSingleTextDictArgument(args) {
	if(args.length!=1) {
		return false;
	}
	var arg = args[0];
	var typ = arg.type ||null
	if(typ==null) {
		return false;
	}
	return typ.equals(argsType);
}

function identicalArguments(args, argTypes) {
	if(args.length!=argTypes.length-1) {
		return false;
	}
	for(var i=0;i<args.length;i++) {
		var typ = args[i].typ || null;
		if(typ==null) {
			return false;
		}
		if(!typ.equals(argTypes[i+1])) {
			return false;
		}
	}
	return true;
}

function Interpreter() {
}

Interpreter.interpret = function(context, methodName, cmdLineArgs) {
	try {
		var method = locateMethod(context, methodName, cmdLineArgs);
		var assignments = buildAssignments(method, cmdLineArgs);
		var call = new MethodCall(new MethodSelector(null, methodName),assignments);
		call.interpret(context);
	} finally {
		context.terminated();
	}
};


Interpreter.interpretTests = function(context) {
    for(var name in context.tests) {
        var test = context.tests[name];
        var local = context.newLocalContext();
        test.interpret(local);
    }
};

exports.Interpreter = Interpreter;


