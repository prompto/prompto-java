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

function removeChildren(nodeId) {
    var container = document.getElementById(nodeId);
    while(container.children.length) {
        container.removeChild(container.children[0]);
    }
}

function closeContextMenu() {
    document.removeEventListener("contextmenu", handleDocumentClick);
    document.removeEventListener("click", handleDocumentClick);
    removeChildren("context");
}

document && document.addEventListener("contextmenu", function(event) { event.preventDefault(); });

var ReactUtils = {
	showModal: function(modal) {
		var container = document.getElementById("modal"); 
		var wrapper = document.createElement("div");
		container.appendChild(wrapper);
		var portal = ReactDOM.createPortal(modal, wrapper);
		ReactDOM.render(portal, wrapper);
	},
	hideModal: function() { 
		removeChildren("modal");
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
	    var portal = ReactDOM.createPortal(menu, wrapper);
	    ReactDOM.render(portal, wrapper);
	},
	hideContextMenu: function() {
		closeContextMenu();
	}
};