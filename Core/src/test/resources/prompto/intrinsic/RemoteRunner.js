/* dummy runner for syntax checking only */
var RemoteRunner = {
		
	run: function(body, andThen, bindTo) {
		var result = body.bind(bindTo)();
		andThen.bind(bindTo)(result);
	}

};