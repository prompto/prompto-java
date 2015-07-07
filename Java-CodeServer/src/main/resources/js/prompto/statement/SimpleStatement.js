var BaseStatement = require("./BaseStatement").BaseStatement;

function SimpleStatement() {
    BaseStatement.call(this);
    return this;
}

SimpleStatement.prototype = Object.create(BaseStatement.prototype);
SimpleStatement.prototype.constructor = SimpleStatement;

exports.SimpleStatement = SimpleStatement;
