function readJSONValue(value) {
	if(value === null || value === undefined)
		return null;
	else if(Array.isArray(value)) {
		var items = value.map(readJSONValue);
		return new List(false, items);
	} else if(isPromptoValue(value)) {
		return readPromptoValue(value);
	} else if(isPromptoEnum(value)) {
		return readPromptoEnum(value);
	} else if(typeof(value) === typeof({})) {
		return readDocument(value);
	} else
		return value; // a string, boolean or number
}

function isPromptoValue(value) {
	return typeof(value.type) === typeof("") && value.value !== undefined;
}

function readPromptoValue(value) {
	if(value.type.endsWith("[]"))
		return readPromptoList(value.value);
	else if(value.type.endsWith("<>"))
		return readPromptoSet(value.value);
	else if(value.type.startsWith("Cursor<"))
		return readPromptoCursor(value.value);
	else switch(value.type) {
		case "Uuid":
			return UUID.fromString(value.value);
		case "Date":
			return LocalDate.parse(value.value);
		case "Time":
			return LocalTime.parse(value.value);
		case "DateTime":
			return DateTime.parse(value.value);
		case "Version":
			return Version.parse(value.value);
		case "Image":
			return ImageRef.fromJSON(value.value);
		case "Blob":
			return BlobRef.fromJSON(value.value);
		case "Document":
			return readDocument(value.value);
		default:
			return readInstance(value);
	}
}

function isPromptoEnum(value) {
	return typeof(value.name) === typeof("") && value.name.length > 0 && value.name === value.name.toUpperCase() && value.value !== undefined;
}

function readPromptoEnum(value) {
	return eval(value.name);
}

function readDocument(value) {
	var document = new Document();
	Object.getOwnPropertyNames(value).forEach(function(name) {
		document.$safe_setMember(name, this.readJSONValue(value[name]));
	}, this);
	return document;
}


function readPromptoList(value) {
	var items = value.map(readJSONValue);
	return new List(false, items);
}


function readPromptoSet(value) {
	var items = value.map(readJSONValue);
	return new StrictSet(items);
}


function readPromptoCursor(value) {
	var iterable = {
		count: function() { return value.count; },
		totalCount: function() { return value.totalCount; },
		iterator: function() {
		    return {
		        idx: 0, 
		        hasNext: function() { return this.idx < value.count },
		        next : function() { return recordToStored(value.items[this.idx++]); }
		    };
		}
	};
	return new Cursor(value.mutable, iterable);
}


function readInstance(value) {
	var type = eval(value.type);
	if(typeof(type)!=='function')
		throw new Error("Unsupported: " + value.type);
	var stored = recordToStored(value);
    var result = new type(null, {}, false);
    result.fromStored(stored);
    return result;
}

function getTypeName(value) {
	var name = typeof(value);
	if(name==="object" && value.__proto__)
		name = value.__proto__.constructor.name;
	return name;
}

function writeJSONValue(value, useDbRefs, formData) {
	if(value==null)
		return value;
	else {
		var typeName = getTypeName(value);
		switch(typeName) {
		case "UUID":
			return { type: "Uuid", value: value.hex };
		case "LocalDate":
			return { type: "Date", value: value.toString() };
		case "LocalTime":
			return { type: "Time", value: value.toString() };
		case "DateTime":
			return { type: "DateTime", value: value.toString() };
		case "Version":
			return { type: "Version", value: value.toString() };
		case "BlobRef":
			return { type: "Blob", value: writeJSONBinary(value, formData) };
		case "ImageRef":
			return { type: "Image", value: writeJSONBinary(value, formData) };
		case "List":
			return value.map(function(value) {
				return writeJSONValue(value, useDbRefs);
			});
		case "StrictSet":
			return Array.from(value.set).map(function(value) {
				return writeJSONValue(value, useDbRefs);
			});
		default:	
			if(typeof($Root) !== 'undefined' && value instanceof $Root) {
				if(useDbRefs) {
					var dbId = value.getOrCreateDbId();
					return { type: "%dbRef%", value: writeJSONValue(dbId, useDbRefs, formData) };
				} else {
					var result = {};
					value.getAttributeNames().forEach(function(attr) {
						result[attr] = writeJSONValue(value[attr], useDbRefs, formData);
					});
					return { type: typeName, value: result};
				}
			} else
				return value;
		}
	}
}

function writeJSONBinary(binary, formData) {
	if(binary.file) {
		if(formData) {
			var partName = '@' + binary.file.name;
			formData.append(partName, binary.file);
			return { mimeType: binary.mimeType, partName: partName };
		} else {
			return { mimeType: binary.mimeType, binaryFile: binary.file }; // for later processing
		}
	} else if (binary.mimeType && binary.url) {
		return { mimeType: binary.mimeType, url: binary.url };
	} else
		return null; // TODO throw ?
}

