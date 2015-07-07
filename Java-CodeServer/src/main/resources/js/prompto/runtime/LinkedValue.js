

/* used to ensure downcast local resolves to actual value */
function LinkedValue(context) {
	this.context = context;
    return this;
}

exports.LinkedValue = LinkedValue;