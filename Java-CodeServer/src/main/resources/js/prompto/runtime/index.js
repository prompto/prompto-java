exports.Context = require('./Context').Context;
exports.VoidResult = require('./VoidResult').VoidResult;
exports.MethodDeclarationMap  = require('./Context').MethodDeclarationMap;
exports.Interpreter = require('./Interpreter').Interpreter;

require('./MethodFinder').resolve();
require('./ErrorVariable').resolve();