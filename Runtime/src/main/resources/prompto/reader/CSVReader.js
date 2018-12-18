
/* we can't use Papa or other js csv libs, because they either load everything in memory or require a continuation */
/* ideally we would use generators, but support with browsers is poor so far */
/* so we use our own stuff until ES6 becomes widespread */


function csvIterate(text, columns, separator, encloser) {
    return new CSVIterator(text, columns, separator, encloser);
}

function csvRead(text, columns, separator, encloser) {
    var list = new intrinsic.List();
    var iter = new CSVIterator(text, columns, separator, encloser);
    while(iter.hasNext())
        list.push(iter.next());
    return list;
}

function CSVIterator(text, columns, separator, encloser) {
    this.text = text || null;
    this.index = 0;
    this.columns = columns;
    this.separator = (separator || ',').charCodeAt(0);
    this.encloser = (encloser || '"').charCodeAt(0);
    this.headers = null;
    this.peekedChar = null;
    this.nextChar = 0;
    return this;
}

var DQ = '"'.charCodeAt(0);
var CR = '\r'.charCodeAt(0);
var LF = '\n'.charCodeAt(0);
var ESC = '\\'.charCodeAt(0);


CSVIterator.prototype.iterator = function() {
    return this;
};

CSVIterator.prototype.hasNext = function() {
    if(this.nextChar==0)
        this.fetchChar(true);
    if(this.headers==null)
        this.parseHeaders();
    return this.nextChar>0;
};



CSVIterator.prototype.next = function() {
    if(!this.hasNext()) // will parse headers
        return null;
    var values = this.parseLine();
    var doc = new intrinsic.Document();
    for(var i=0;i<this.headers.length;i++) {
        if(i<values.length)
            doc[this.headers[i]] = values[i];
        else
            doc[this.headers[i]] = null;
    }
    return doc;
};

CSVIterator.prototype.fetchChar = function(eatNewLine) {
    eatNewLine = eatNewLine || false;
    if(this.text==null)
        this.nextChar = -1; // EOF
    else if(this.peekedChar!=null) {
        var c = this.peekedChar;
        this.peekedChar = null;
        this.nextChar = c;
    } else {
        var c = this.index < this.text.length ? this.text.charCodeAt(this.index++) : -1;
        if(c==CR)
            this.fetchChar(eatNewLine);
        else if(eatNewLine && (c==LF))
            this.fetchChar(eatNewLine);
        else
            this.nextChar = c;
    }
};

CSVIterator.prototype.peekChar = function() {
    if(this.peekedChar==null) {
        var oldChar = this.nextChar;
        this.fetchChar();
        this.peekedChar = this.nextChar;
        this.nextChar = oldChar;
    }
    return this.peekedChar;
}


CSVIterator.prototype.parseHeaders = function() {
    this.headers = this.parseLine();
    if(this.columns!=null)
        this.headers = this.headers.map(function(header) {
            return this.columns[header] || header;
        }, this);
};

CSVIterator.prototype.parseLine = function() {
    var list = [];
    while(this.parseValue(list))
        ;
    if(this.nextChar==LF)
        this.fetchChar();
    return list;
};

CSVIterator.prototype.parseValue = function(list) {
    if(this.nextChar==this.separator)
        this.parseEmptyValue(list);
    else if(this.nextChar==this.encloser)
        this.parseQuotedValue(list);
    else
        this.parseUnquotedValue(list);
    return this.nextChar!=-1 && this.nextChar!=LF;
};


CSVIterator.prototype.parseEmptyValue = function(list) {
    list.push(null);
    this.fetchChar();
};


CSVIterator.prototype.parseQuotedValue = function(list) {
    this.fetchChar(); // consume the leading double quote
    this.parseValueUpTo(this.encloser, list);
    // look for next sep
    while(this.nextChar!=this.separator && this.nextChar!=-1 && this.nextChar!=LF)
        this.fetchChar();
    if(this.nextChar==this.separator)
        this.fetchChar();
};

CSVIterator.prototype.parseUnquotedValue = function(list) {
    return this.parseValueUpTo(this.separator, list);
};

CSVIterator.prototype.parseValueUpTo = function(endChar, list) {
    var chars = [];
    var exit = false;
    for(;;) {
        if(this.nextChar==-1)
            exit = this.handleEOF(chars, endChar, list);
        else if(this.nextChar==LF)
            exit = this.handleNewLine(chars, endChar, list);
        else if(this.nextChar==endChar)
            exit = this.handleEndChar(chars, endChar, list);
        else if(this.nextChar==ESC)
            exit = this.handleEscape(chars, endChar, list);
        else
            exit = this.handleOtherChar(chars, endChar, list);
        if(exit) {
            if(chars.length>0) {
                chars = chars.map(function(c) {
                    return String.fromCharCode(c);
                });
                list.push(chars.join(""));
            }
            return;
        }
    }
};


CSVIterator.prototype.handleOtherChar = function(chars, endChar, list) {
    chars.push(this.nextChar);
    this.fetchChar();
    return false;
};


CSVIterator.prototype.handleEscape = function(chars, endChar, list) {
    if(this.peekChar()!=-1) {
        chars.push(this.peekChar());
        this.fetchChar();
    }
    this.fetchChar();
    return false;
};


CSVIterator.prototype.handleEOF = function(chars, endChar, list) {
    return true;
}

CSVIterator.prototype.handleEndChar = function(chars, endChar, list) {
    if(endChar==DQ && this.peekChar()==endChar) {
        chars.push(this.nextChar);
        this.fetchChar();
        this.fetchChar();
        return false;
    } else {
        this.fetchChar();
        return true;
    }
};


CSVIterator.prototype.handleNewLine = function(chars, endChar, list) {
    if(endChar==DQ) {
        chars.push(this.nextChar);
        this.fetchChar();
        return false;
    } else {
        return true;
    }
}


exports.csvIterate = csvIterate;
exports.csvRead = csvRead;