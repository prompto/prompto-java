var SyntaxError = require("../error/SyntaxError").SyntaxError;
var PrestoError = require("../error/PrestoError").PrestoError;
var CategoryType = null;
var Score = require("./Score").Score;

exports.resolve = function() {
	CategoryType = require("../type/CategoryType").CategoryType;
}

function MethodFinder(context, methodCall) {
	this.context = context;
	this.methodCall = methodCall;
	return this;
}

MethodFinder.prototype.findMethod = function(checkInstance) {
	var selector = this.methodCall.method;
	var candidates = selector.getCandidates(this.context);
	var compatibles = this.filterCompatible(candidates, checkInstance);
	switch(compatibles.length) {
	case 0:
		// TODO refine
		throw new SyntaxError("No matching prototype for:" + this.methodCall.toString());
	case 1:
		return compatibles[0];
	default:
		return this.findMostSpecific(compatibles, checkInstance);
	}
}

MethodFinder.prototype.findMostSpecific = function(candidates, checkInstance) {
	var candidate = null;
	var ambiguous = [];
	for(var i=0;i<candidates.length;i++) {
		if(candidate==null)
			candidate = candidates[i];
		else {
			var score = this.scoreMostSpecific(candidate, candidates[i], checkInstance);
			switch(score) {
			case Score.WORSE:
				candidate = candidates[i];
				ambiguous = [];
				break;
			case Score.BETTER:
				break;
			case Score.SIMILAR:
				ambiguous.push(candidates[i]);
				break;
			}
		}
	}
	if(ambiguous.length>0) {
		throw new SyntaxError("Too many prototypes!"); // TODO refine
	}
	return candidate;
}

MethodFinder.prototype.scoreMostSpecific = function(d1, d2, checkInstance) {
	try {
		var s1 = this.context.newLocalContext();
		d1.registerArguments(s1);
		var s2 = this.context.newLocalContext();
		d2.registerArguments(s2);
		var ass1 = this.methodCall.makeAssignments(this.context, d1);
		var ass2 = this.methodCall.makeAssignments(this.context, d2);
		for(var i=0;i<ass1.length && i<ass2.length;i++) {
			var as1 = ass1[i];
			var as2 = ass2[i];
			var ar1 = d1.args.find(as1.name);
			var ar2 = d2.args.find(as2.name);
			if(as1.name===as2.name) {
				// the general case with named arguments
				var t1 = ar1.getType(s1);
				var t2 = ar2.getType(s2);
				// try resolving runtime type
				if(checkInstance && t1 instanceof CategoryType && t2 instanceof CategoryType) {
					var value = as1.expression.interpret(this.context); // in the named case as1==as2, so only evaluate 1
					if(value.getType) {
						var actual = value.getType();
						var score = actual.scoreMostSpecific(this.context, t1, t2);
						if(score!==Score.SIMILAR) {
							return score;
						}
					}
				}
				if(t1.isMoreSpecificThan(s2,t2)) {
					return Score.BETTER;
				}
				if(t2.isMoreSpecificThan(s1,t1)) {
					return Score.WORSE;
				}
			} else {
				// specific case for single anonymous argument
				var sp1 = d1.computeSpecificity(s1, ar1, as1, checkInstance);
				var sp2 = d2.computeSpecificity(s2, ar2, as2, checkInstance);
				if(sp1.greaterThan(sp2)) {
					return Score.BETTER;
				}
				if(sp2.greaterThan(sp1)) {
					return Score.WORSE;
				}
			}
		}
	} catch(error) {
		if(!(error instanceof PrestoError)) {
			throw error;
		}
	}
	return Score.SIMILAR;
}

MethodFinder.prototype.filterCompatible = function(candidates, checkInstance) {
	var compatibles = [];
	for(var i=0;i<candidates.length;i++) {
		var declaration = candidates[i];
		try {
			var assignments = this.methodCall.makeAssignments(this.context,declaration);
			if(declaration.isAssignableTo(this.context, assignments, checkInstance)) {
				compatibles.push(declaration);
			}
		} catch(e) {
			if(!(e instanceof SyntaxError)) {
				throw e;
			}
			// else OK
		}
	}
	return compatibles;
}


exports.MethodFinder = MethodFinder;