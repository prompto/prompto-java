var ReactUtils = {
	showModal: function(modal) {
		var container = document.getElementById("modal"); 
		var holder = document.createElement("div");
		container.appendChild(holder);
		ReactDOM.render(ReactDOM.createPortal(modal, holder), container);
	},
	hideModal: function() { 
	    const container = document.getElementById("modal");
	    while(container.children.length) {
	        container.removeChild(container.children[0]);
	    }
	}
};