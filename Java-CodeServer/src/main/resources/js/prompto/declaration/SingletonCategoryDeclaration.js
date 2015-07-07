var ConcreteCategoryDeclaration = require("./ConcreteCategoryDeclaration").ConcreteCategoryDeclaration;

function SingletonCategoryDeclaration(name, attributes, methods) {
    ConcreteCategoryDeclaration.call(this, name, attributes, null, methods);
    return this;
}

SingletonCategoryDeclaration.prototype = Object.create(ConcreteCategoryDeclaration.prototype);
SingletonCategoryDeclaration.prototype.constructor = SingletonCategoryDeclaration;

SingletonCategoryDeclaration.prototype.categoryTypeToEDialect = function(writer) {
    writer.append("singleton");
};

SingletonCategoryDeclaration.prototype.categoryTypeToODialect = function(writer) {
    writer.append("singleton");
};

SingletonCategoryDeclaration.prototype.categoryTypeToSDialect = function(writer) {
    writer.append("singleton");
};

exports.SingletonCategoryDeclaration = SingletonCategoryDeclaration;