function execute(body, andThen, bindTo) {
	body.bind(bindTo)();
	andThen.bind(bindTo)();
}