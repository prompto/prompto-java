var UnresolvedIdentifier = require("../grammar/UnresolvedIdentifier").UnresolvedIdentifier;
var ArgumentAssignmentList = null;
var ArgumentAssignment = null;
var ConcreteCategoryDeclaration = null;
var ExpressionValue = require("../value/ExpressionValue").ExpressionValue;
var Operator = require("../grammar/Operator").Operator;
var BaseType = require("./BaseType").BaseType;
var AnyType = require("./AnyType").AnyType;
var PrestoError = require("../error/PrestoError").PrestoError;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var MethodCall = require("../statement/MethodCall").MethodCall;
var MethodSelector = require("../expression/MethodSelector").MethodSelector;
var MethodFinder = require("../runtime/MethodFinder").MethodFinder;
var Score = require("../runtime/Score").Score;

exports.resolve = function() {
	ArgumentAssignmentList = require("../grammar/ArgumentAssignmentList").ArgumentAssignmentList;
	ArgumentAssignment = require("../grammar/ArgumentAssignment").ArgumentAssignment;
    ConcreteCategoryDeclaration = require("../declaration/ConcreteCategoryDeclaration").ConcreteCategoryDeclaration;
}
function CategoryType(name) {
	BaseType.call(this, name);
	return this;
}

CategoryType.prototype = Object.create(BaseType.prototype);
CategoryType.prototype.constructor =  CategoryType;

/*
	
	public Class<?> toJavaClass() {
		// TODO Auto-generated method stub
		return null;
	}
*/

CategoryType.prototype.equals = function(obj) {
	if(obj===this) {
		return true;
	}
	if(obj===null) {
		return false;
	}
	if(!(obj instanceof CategoryType)) {
		return false;
	}
	return this.name===obj.name;
};

CategoryType.prototype.checkUnique = function(context) {
	var actual = context.getRegisteredDeclaration(this.name) || null;
	if(actual!=null) {
		throw new SyntaxError("Duplicate name: \"" + this.name + "\"");
	}
};

CategoryType.prototype.getDeclaration = function(context) {
	var actual = context.getRegisteredDeclaration(this.name) || null;
	if(actual==null) {
		throw new SyntaxError("Unknown category: \"" + this.name + "\"");
	}
	return actual;
};


CategoryType.prototype.checkMultiply = function(context, other, tryReverse) {
    var type = this.checkOperator(context, other, tryReverse, Operator.MULTIPLY);
    if(type!=null)
        return type;
    else
        return BaseType.prototype.checkMultiply.call(this, context, other, tryReverse);
}


CategoryType.prototype.checkDivide = function(context, other) {
    var type = this.checkOperator(context, other, false, Operator.DIVIDE);
    if(type!=null)
        return type;
    else
        return BaseType.prototype.checkDivide.call(this, context, other);
}


CategoryType.prototype.checkIntDivide = function(context, other) {
    var type = this.checkOperator(context, other, false, Operator.IDIVIDE);
    if(type!=null)
        return type;
    else
        return BaseType.prototype.checkIntDivide.call(this, context, other);
}


CategoryType.prototype.checkModulo = function(context, other) {
    var type = this.checkOperator(context, other, false, Operator.MODULO);
    if(type!=null)
        return type;
    else
        return BaseType.prototype.checkModulo.call(this, context, other);
}


CategoryType.prototype.checkAdd = function(context, other, tryReverse) {
    var type = this.checkOperator(context, other, tryReverse, Operator.PLUS);
    if(type!=null)
        return type;
    else
        return BaseType.prototype.checkAdd.call(this, context, other, tryReverse);
}


CategoryType.prototype.checkSubstract = function(context, other) {
    var type = this.checkOperator(context, other, false, Operator.MINUS);
    if(type!=null)
        return type;
    else
        return BaseType.prototype.checkSubstract.call(this, context, other);
}

CategoryType.prototype.checkOperator = function(context, other, tryReverse, operator) {
    var actual = this.getDeclaration(context);
    if(actual instanceof ConcreteCategoryDeclaration) try {
        var method = actual.findOperator(context, operator, other);
        if(method==null)
            return null;
        context = context.newInstanceContext(null, this);
        var local = context.newLocalContext();
        method.registerArguments(local);
        return method.check(local);
    } catch(e) {
        // ok to pass, will try reverse
    }
    if(tryReverse)
        return null;
    else
        throw new SyntaxError("Unsupported operation: " + this.name + " " + operator.token + " " + other.name);
}

CategoryType.prototype.checkExists = function(context) {
	this.getDeclaration(context);
};

CategoryType.prototype.checkMember = function(context, name) {
	var cd = context.getRegisteredDeclaration(this.name);
	if (cd == null) {
		throw new SyntaxError("Unknown category:" + this.name);
	}
	if (!cd.hasAttribute(context, name)) {
		throw new SyntaxError("No attribute:" + name + " in category:" + this.name);
	}
	var ad = context.getRegisteredDeclaration(name);
	if (ad == null) {
		throw new SyntaxError("Unknown atttribute:" + name);
	}
	return ad.getType(context);
};

CategoryType.prototype.isAssignableTo = function(context, other) {
	if(this.name==other.name) {
		return true;
	} else if(other instanceof AnyType) {
		return true;
	} else if(!(other instanceof CategoryType)) {
		return false;
	} else {
		return this.isAssignableToCategory(context,other);
	}
};

CategoryType.prototype.isAssignableToCategory = function(context, other) {
	if(this.name == other.name) {
		return true;
	}
	try {
		var	cd = this.getDeclaration(context);
		return this.isDerivedFromCompatibleCategory(context,cd,other) || this.isAssignableToAnonymousCategory(context,cd,other);
	} catch (e) {
		if(e instanceof SyntaxError ) {
			return false;
		} else {
			throw e;
		}
	}
};

CategoryType.prototype.isDerivedFromCompatibleCategory = function(context, decl, other) {
	if(decl.derivedFrom==null) {
		return false;
	}
	for(var i=0;i<decl.derivedFrom.length; i++) {
		var ct = new CategoryType(decl.derivedFrom[i]);
		if (ct.isAssignableTo(context, other)) {
			return true;
		}
	}
	return false;
}

CategoryType.prototype.isAssignableToAnonymousCategory = function(context, decl, other) {
	if(!other.isAnonymous()) {
		return false;
	}
	try {
		var	cd = other.getDeclaration(context);
		return this.isAssignableToAnonymousCategoryDeclaration(context, decl, cd);
	} catch (e) {
		if(e instanceof SyntaxError ) {
			return false;
		} else {
			throw e;
		}
	}
};

CategoryType.prototype.isAnonymous = function() {
	return this.name[0]==this.name[0].toLowerCase(); // since it's the name of the argument
}

CategoryType.prototype.isAssignableToAnonymousCategoryDeclaration = function(context, decl, other) {
	// an anonymous category extends 1 and only 1 category
	var baseName = other.derivedFrom[0];
	// check we derive from root category (if not extending 'Any')
	if("any"!=baseName && !decl.isDerivedFrom(context,new CategoryType(baseName)))
		return false;
	for(var i=0;i<other.attributes.length;i++) {
		if(!decl.hasAttribute(context,other.attributes[i])) {
			return false;
		}
	}
	return true;
};

CategoryType.prototype.isMoreSpecificThan = function(context, other) {
	if(!(other instanceof CategoryType)) {
		return false;
	}
	if(other.isAnonymous()) {
		return true;
	}
	var thisDecl = context.getRegisteredDeclaration(this.name);
	if(thisDecl.isDerivedFrom(context, other)) {
		return true;
	} else {
		return false;
	}
};

CategoryType.prototype.scoreMostSpecific = function(context, t1, t2) {
	if(t1.equals(t2)) {
		return Score.SIMILAR;
	} else if(this.equals(t1)) {
		return Score.BETTER;
	} else  if(this.equals(t2)) {
		return Score.WORSE;
	}
	// since this derives from both t1 and t2, return the most specific of t1 and t2
	if(t1.isMoreSpecificThan(context,t2)) {
		return Score.BETTER;
	} else if(t2.isMoreSpecificThan(context,t1)) {
		return Score.WORSE;
	} else {
		return Score.SIMILAR;
	} // should never happen
};


CategoryType.prototype.newInstance = function(context) {
	var decl = context.getRegisteredDeclaration(this.name);
	return decl.newInstance();
};


CategoryType.prototype.sort = function(context, list, key) {
	if (list.size() <= 1) {
		return list;
	}
	key = key || null;
	if (key == null) {
		key = new UnresolvedIdentifier("key");
	}
	var keyname = key.toString();
	var decl = this.getDeclaration(context);
	if (decl.hasAttribute(context, keyname)) {
		return this.sortByAttribute(context, list, keyname);
	} else if (decl.hasMethod(context, keyname, null)) {
		return this.sortByClassMethod(context, list, keyname);
	} else {
		var method = this.findGlobalMethod(context, list, keyname);
		if(method!=null) {
			return this.sortByGlobalMethod(context, list, method);
		} else {
			return this.sortByExpression(context, list, key);
		}
	}
};

CategoryType.prototype.sortByExpression = function(context, list, key) {

	function cmp(o1, o2) {
		var co = context.newInstanceContext(o1, null);
		var key1 = key.interpret(co);
		co = context.newInstanceContext(o2, null);
		var key2 = key.interpret(co);
		return compareKeys(key1, key2);
	}
	return BaseType.prototype.sort(context, list, cmp);
};

CategoryType.prototype.sortByAttribute = function(context, list, name) {

	function cmp(o1, o2) {
		var key1 = o1.getMember(context, name);
		var key2 = o2.getMember(context, name);
		return compareKeys(key1,key2);
	}

	return BaseType.prototype.sort(context, list, cmp);
};

/*
private ListValue sortByClassMethod = function(context, ListValue list, final String name) {
	return null;
}

*/

/* look for a method which takes this category as sole parameter */
CategoryType.prototype.findGlobalMethod = function(context, list, name) {
	try {
		var exp = new ExpressionValue(this, this.newInstance(context));
		var arg = new ArgumentAssignment(null, exp);
		var args = new ArgumentAssignmentList(null, arg);
		var proto = new MethodCall(new MethodSelector(null, name), args);
		var finder = new MethodFinder(context, proto);
		var decl = finder.findMethod(true);
		return decl==null ? null : proto;
	} catch (e) {
		if(e instanceof PrestoError) {
			return null;
		} else {
			throw e;
		}
	}
};

CategoryType.prototype.sortByGlobalMethod = function(context, list, method) {
	var type = this;
	function cmp(o1, o2) {
		var assignment = method.assignments[0];
		assignment.expression = new ExpressionValue(type, o1);
		var key1 = method.interpret(context);
		assignment.expression = new ExpressionValue(type, o2);
		var key2 = method.interpret(context);
		return compareKeys(key1, key2);
	}

	return BaseType.prototype.sort(context, list, cmp);
};


function compareKeys(key1, key2) {
	if(key1==null && key2==null) {
		return 0;
	} else if(key1==null) {
		return -1;
	} else if(key2==null) {
		return 1;
	} else if(key1.compareTo) {
		return key1.compareTo(key2);
	} else if(key2.compareTo) {
		return -key2.compareTo(key1);
	} else {
		var s1 = key1.toString();
		var s2 = key2.toString();
		return s1 > s2 ? 1 : s1 == s2 ? 0 : -1;
	}
};


exports.CategoryType = CategoryType;