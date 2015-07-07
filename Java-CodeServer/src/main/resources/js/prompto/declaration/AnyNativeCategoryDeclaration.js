var NativeCategoryDeclaration = require("./NativeCategoryDeclaration").NativeCategoryDeclaration;

function AnyNativeCategoryDeclaration() {
    NativeCategoryDeclaration.call(this, "Any", [], [], [], []);
    return this;
}

AnyNativeCategoryDeclaration.prototype = Object.create(NativeCategoryDeclaration.prototype);
AnyNativeCategoryDeclaration.prototype.constructor = AnyNativeCategoryDeclaration;

AnyNativeCategoryDeclaration.instance = new AnyNativeCategoryDeclaration();

exports.AnyNativeCategoryDeclaration = AnyNativeCategoryDeclaration;
