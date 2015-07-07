var BaseDeclaration = require("./BaseDeclaration").BaseDeclaration;
var VoidType = require("../type/VoidType").VoidType;

function TestMethodDeclaration(name, stmts, exps, error) {
    BaseDeclaration.call(this, name);
    this.statements = stmts;
    this.assertions = exps;
    this.error = error;
    return this;
}

TestMethodDeclaration.prototype = Object.create(BaseDeclaration.prototype);
TestMethodDeclaration.prototype.constructor = TestMethodDeclaration;

TestMethodDeclaration.prototype.check = function(context)
{
    // TODO
    return VoidType.instance;
};

TestMethodDeclaration.prototype.register = function(context)
{
    context.registerTestDeclaration (this);
};

TestMethodDeclaration.prototype.getType = function(context)
{
    return VoidType.instance;
};

TestMethodDeclaration.prototype.interpret = function(context)
{
    if (this.interpretBody (context)) {
        this.interpretNoError (context);
        this.interpretAsserts (context);
    }
};

TestMethodDeclaration.prototype.interpretNoError = function(context)
{
    // we land here only if no error was raised
    if (this.error != null)
        this.printFailure (context, this.error.name, "no error");
};

TestMethodDeclaration.prototype.interpretAsserts = function(context)
{
    if (this.assertions == null)
        return;
    context.enterMethod (this);
    try {
        var success = true;
        for(var i=0;i<this.assertions.length;i++) {
            success &= this.assertions[i].interpretAssert (context, this);
        }
        if (success)
            this.printSuccess (context);
    } finally {
        context.leaveMethod (this);
    }
};

TestMethodDeclaration.prototype.printFailure = function(context, expected, actual)
{
    process.stdout.write (this.name + " test failed, expected: " + expected + ", actual: " + actual);
};

TestMethodDeclaration.prototype.printSuccess = function(context)
{
    process.stdout.write (this.name + " test successful");
};

TestMethodDeclaration.prototype.interpretBody = function(context)
{
    context.enterMethod (this);
    try {
        this.statements.interpret (context);
        return true;
    } catch (e) {
        this.interpretError (context, e);
        // no more to execute
        return false;
    } finally {
        context.leaveMethod (this);
    }
};

TestMethodDeclaration.prototype.interpretError = function(context, ex)
{
    var expectedError = this.error == null ? null : this.error.interpret (context);
    var actual = ex.interpret (context, "__test_error__");
    if (expectedError!=null && expectedError.equals (actual))
        this.printSuccess (context);
    else {
        var actualName = actual.getMember (context, "name").toString ();
        var expectedName = this.error == null ? "SUCCESS" : this.error.name;
        this.printFailure (context, expectedName, actualName);
    }
};

TestMethodDeclaration.prototype.toDialect = function(writer)
{
    if (writer.isGlobalContext ())
        writer = writer.newLocalWriter ();
    writer.toDialect(this);
};

TestMethodDeclaration.prototype.toSDialect = function(writer)
{
    writer.append ("def test ");
    writer.append (this.name);
    writer.append (" ():\n");
    writer.indent ();
    this.statements.toDialect (writer);
    writer.dedent ();
    writer.append ("expecting:");
    if (this.error != null) {
        writer.append (" ");
        this.error.toDialect (writer);
        writer.append ("\n");
    } else {
        writer.append ("\n");
        writer.indent ();
        for(var i=0;i<this.assertions.length;i++) {
            this.assertions[i].toDialect (writer);
            writer.append ("\n");
        }
        writer.dedent ();
    }
};

TestMethodDeclaration.prototype.toEDialect = function(writer)
{
    writer.append ("define ");
    writer.append (this.name);
    writer.append (" as: test method doing:\n");
    writer.indent ();
    this.statements.toDialect (writer);
    writer.dedent ();
    writer.append ("and expecting:");
    if (this.error != null) {
        writer.append (" ");
        this.error.toDialect (writer);
        writer.append ("\n");
    } else {
        writer.append ("\n");
        writer.indent ();
        for(var i=0;i<this.assertions.length;i++) {
            this.assertions[i].toDialect (writer);
            writer.append ("\n");
        }
        writer.dedent ();
    }
};

TestMethodDeclaration.prototype.toODialect = function(writer)
{
    writer.append ("test method ");
    writer.append (this.name);
    writer.append (" () {\n");
    writer.indent ();
    this.statements.toDialect (writer);
    writer.dedent ();
    writer.append ("} expecting ");
    if (this.error != null) {
        this.error.toDialect (writer);
        writer.append (";\n");
    } else {
        writer.append ("{\n");
        writer.indent ();
        for(var i=0;i<this.assertions.length;i++) {
            this.assertions[i].toDialect (writer);
            writer.append (";\n");
        }
        writer.dedent ();
        writer.append ("}\n");
    }
};


exports.TestMethodDeclaration = TestMethodDeclaration;
