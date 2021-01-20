function openWebSocket(url, onMessage, onClose, callback) {
    var webSocket = new window.WebSocket(url);
    webSocket.onopen = function(event) {
    	webSocket.onmessage = function(event) {
    		if(event.type==="message" && event.data) {
    			var value = event.data;
    			if(typeof(value)===typeof(""))
    				value = JSON.parse(value);
    			value = readJSONValue(value);	 
	    		if(onMessage)
	    			onMessage(value);
			}
    	};
    	webSocket.onclose = function(event) {
    		if(onClose)
    			onClose();
		};
    	if(callback)
    		callback(webSocket);
    }
}



