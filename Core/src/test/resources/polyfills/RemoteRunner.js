/* dummy runner for syntax checking only */
/* in polyfills to ensure actual RemoteRunner is loaded */
var RemoteRunner = {
		
	run: function(name, params, andThen, bindTo) {
		andThen.bind(bindTo)(null);
	}

};