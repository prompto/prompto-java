function Score() {
	return this;
}

Score.BETTER = new Score();
Score.WORSE = new Score();
Score.SIMILAR = new Score();

exports.Score = Score;
