function VoidResult() {
    return this;
}

VoidResult.instance = new VoidResult();

exports.VoidResult = VoidResult;