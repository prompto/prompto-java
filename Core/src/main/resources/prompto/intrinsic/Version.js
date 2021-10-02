function Version(major, minor, fix, qualifier) {
    this.major = major;
    this.minor = minor;
    this.fix = fix || 0;
    this.qualifier = qualifier || 0;
    return this;
}

Version.prototype.equals = function(obj) {
    return obj instanceof Version && this.asInt() == obj.asInt();
};


Version.prototype.toString = function() {
    if (this === Version.LATEST)
        return "latest";
    else if (this === Version.DEVELOPMENT)
        return "development";
    else {
        var s = "v" + this.major + "." + this.minor;
        if (this.fix)
            s = s + "." + this.fix;
        if (this.qualifier)
            s = s + "-" + this.qualifierToString();
        return s;
    }
};

Version.prototype.qualifierToString = function() {
    switch(this.qualifier) {
        case -3:
            return "alpha";
        case -2:
            return "beta";
        case -1:
            return "candidate";
        default:
            return "";
     }
};

Version.prototype.getText = Version.prototype.toString;


Version.prototype.asInt = function() {
    return (this.major << 24) | (this.minor << 16) | this.fix;
};

Version.prototype.gt = function(other) {
    return other instanceof Version && this.asInt() > other.asInt();
};


Version.prototype.gte = function(other) {
    return other instanceof Version && this.asInt() >= other.asInt();
};

Version.prototype.lt = function(other) {
    return other instanceof Version && this.asInt() < other.asInt();
};

Version.prototype.lte = function(other) {
    return other instanceof Version && this.asInt() <= other.asInt();
};


Version.prototype.cmp = function(value) {
    var a = this.asInt();
    var b = value.asInt();
    return a > b ? 1 : (a == b ? 0 : -1);
};

Version.parse = function(literal) {
    if (literal === "latest")
        return Version.LATEST;
    else if (literal === "development")
        return Version.DEVELOPMENT;
    else
        return Version.parsePrefixedSemanticVersion(literal);
};

Version.parsePrefixedSemanticVersion = function(literal) {
    if (literal.startsWith("v"))
        literal = literal.substring(1);
    return Version.parseSemanticVersion(literal);
}

Version.parseSemanticVersion = function(literal) {
    var parts = literal.split("-");
    var version = Version.parseVersionNumber(parts[0]);
    if (parts.length > 1)
        version.qualifier = Version.parseQualifier(parts[1]);
    return version;
};

Version.parseVersionNumber = function(literal) {
    var parts = literal.split(".");
    var major = parseInt(parts[0]);
    var minor = parseInt(parts[1]);
    var fix = parts.length > 2 ? parseInt(parts[2]) : 0;
    return new Version(major, minor, fix);
};

Version.parseQualifier = function(literal) {
    switch(literal) {
        case "":
			return 0;
		case "alpha":
            return -3;
        case "beta":
            return -2;
        case "candidate":
            return -1;
        default:
            throw new Error("Version qualifier must be <empty>, 'alpha', 'beta' or 'candidate'!");
    }
}

Version.LATEST = new Version(0xFF, 0xFF, 0xFF, 0xFF);
Version.DEVELOPMENT = new Version(0xFE, 0xFE, 0xFE, 0xFE);

