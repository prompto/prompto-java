
function sleep(millis) {
    var start = new Date().getTime();
    while(new Date().getTime() - start < millis);
}

exports.sleep = sleep;