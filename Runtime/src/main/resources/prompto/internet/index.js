exports.Html = require('./Html');
exports.Url = require('./Url').Url;
// the below is needed for webpack only, nodejs uses Html.js
exports.HtmlEncoder = require('./HtmlEncoder');
exports.htmlEncode = exports.HtmlEncoder.htmlEncode;
exports.htmlDecode = exports.HtmlEncoder.htmlDecode;

