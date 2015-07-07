var ConcreteMethodDeclaration = require("../declaration/ConcreteMethodDeclaration").ConcreteMethodDeclaration;
var ExpressionValue = require("../value/ExpressionValue").ExpressionValue;
var ClosureValue = require("../value/ClosureValue").ClosureValue;
var BaseStatement = require("./BaseStatement").BaseStatement;
var SyntaxError = require("../error/SyntaxError").SyntaxError;
var MethodType = require("../type/MethodType").MethodType;
var VoidType = require("../type/VoidType").VoidType;
var Variable = require("../runtime/Variable").Variable;

function DeclarationInstruction(declaration) {
	BaseStatement.call(this);
	this.declaration = declaration;
	return this;
}

DeclarationInstruction.prototype = Object.create(BaseStatement.prototype);
DeclarationInstruction.prototype.constructor = DeclarationInstruction;

DeclarationInstruction.prototype.toDialect = function(writer) {
    if(this.declaration instanceof ConcreteMethodDeclaration) try {
        writer.context.registerMethodDeclaration(this.declaration);
     } catch(e) {
        // ok
     }
    this.declaration.toDialect(writer);
};


DeclarationInstruction.prototype.check = function(context) {
	if(this.declaration instanceof ConcreteMethodDeclaration) {
		this.declaration.checkChild(context);
		context.registerMethodDeclaration(this.declaration);
	} else {
		throw new SyntaxError("Unsupported:" + typeof(declaration));
	}
	return VoidType.instance;
};

DeclarationInstruction.prototype.interpret = function(context) {
	if(this.declaration instanceof ConcreteMethodDeclaration) {
		var method = this.declaration;
		context.registerMethodDeclaration(method);
		var type = new MethodType(context,method);
		context.registerValue(new Variable(method.name, type));
		context.setValue(method.name, new ClosureValue(context, method));
		return null;
	} else {
		throw new SyntaxError("Unsupported:" + typeof(this.declaration));
	}
};


exports.DeclarationInstruction = DeclarationInstruction;
