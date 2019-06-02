/* dummy runner for syntax checking only */
/* in polyfills to ensure actual RemoteRunner is loaded */
var RemoteRunner = {
		
	run: function(body, andThen, bindTo) {
		var result = body.bind(bindTo)();
		andThen.bind(bindTo)(result);
	}

};