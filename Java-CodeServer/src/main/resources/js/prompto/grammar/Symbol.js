var Section = require("../parser/Section").Section;

function Symbol(symbol) {
    Section.call(this);
    this.symbol = symbol;
    return this;
}

Symbol.prototype = Object.create(Section.prototype);
Symbol.prototype.constructor = Symbol;

Object.defineProperty(Symbol.prototype, "name", { get: function () { return this.symbol; } } );

Symbol.prototype.register = function (context) {
    context.registerValue(this);
};

/*
 @Override
 public abstract IType getType(Context context) throws SyntaxError;

 public abstract IType check(Context context) throws SyntaxError;

 public abstract Object interpret(Context context) throws PrestoError;

 */

exports.Symbol = Symbol;
