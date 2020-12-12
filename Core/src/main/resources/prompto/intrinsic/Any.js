function Any() {
	return this;
}


Any.prototype.toString = function() {
  var parts = Object.getOwnPropertyNames(this).map(function(name) {
    return name + ": " + (this[name] ? this[name].toString() : "null");
  }, this);
  return "{ " + parts.join(", ") + " }";
};

Any.prototype.getText = Any.prototype.toString;

if(typeof(exports) !== "undefined")
	exports.Any = Any;