function contains(elem, child) {
    while(child!=null) {
        if(child===elem)
            return true;
        child = child.parentElement;
    }
    return false;
}

function handleDocumentClick(e) {
    var wrapper = document.getElementById("context-menu-wrapper");
    var inside = contains(wrapper, e.target);
    // only bubble up useful clicks
    if(!inside || e.target.href==="#")
        e.stopPropagation();
    closeContextMenu();
}

function closeContextMenu() {
    document.removeEventListener("contextmenu", handleDocumentClick);
    document.removeEventListener("click", handleDocumentClick);
    var container = document.getElementById("context");
    while(container.children.length) {
        container.removeChild(container.children[0]);
    }
}


var ReactUtils = {
	showModal: function(modal) {
		var container = document.getElementById("modal"); 
		var holder = document.createElement("div");
		container.appendChild(holder);
		ReactDOM.render(ReactDOM.createPortal(modal, holder), container);
	},
	hideModal: function() { 
		var container = document.getElementById("modal");
	    while(container.children.length) {
	        container.removeChild(container.children[0]);
	    }
	},
	showContextMenu: function(event, menu) {
		event.preventDefault();
	    document.addEventListener("click", handleDocumentClick );
	    document.addEventListener("contextmenu", handleDocumentClick );
	    var container = document.getElementById("context");
	    var wrapper = document.createElement("div");
	    wrapper.id = "context-menu-wrapper";
	    wrapper.style.position = "fixed";
	    wrapper.style.display = "block";
	    wrapper.style.left = (event.pageX - window.scrollX) + "px";
	    wrapper.style.top = (event.pageY - window.scrollY) + "px";
	    wrapper.style.zIndex = 999999;
	    container.appendChild(wrapper);
	    ReactDOM.render(ReactDOM.createPortal(menu, wrapper), container);
	},
	hideContextMenu: function() {
		closeContextMenu();
	}
};