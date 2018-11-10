function execute(body, andThen) {
	body();
	andThen();
}