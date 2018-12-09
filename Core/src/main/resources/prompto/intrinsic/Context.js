function Context() {
	
	this.fetchTextResource = function(path) {
		var response = null;
		var request  = new XMLHttpRequest();
	    var params = JSON.stringify([{name: "path", value: path}]);
  		var url = "/ws/run/fetchTextResource?params=" + encodeURI(params);
		request.open("GET", url, false); // must be synchronous
		request.setRequestHeader("Content-type", "text/plain; charset=utf-8");
		request.onload = function() { 
			if (this.status == 200)
				response = JSON.parse(this.responseText); 
			else
				throw new Error(this.statusText); // TODO throw PromptoError
		};
		request.onerror = function() {
			throw this.error;
		};
		request.send(null);
		if(response.error)
			throw new Error(response.error); // TODO throw PromptoError
		else
			return response.data;
	};
	
	return this;
}

var $context = new Context();