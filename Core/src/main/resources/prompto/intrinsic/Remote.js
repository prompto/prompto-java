function readJSONValue(value) {
	if(value==null)
		return null;
	else if(Array.isArray(value)) {
		var items = value.map(readJSONValue);
		return new List(false, items);
	} else if(value.type) {
		if(value.type.endsWith("[]"))
			return readList(value);
		switch(value.type) {
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
			case "Cursor":
				return readCursor(value);
			default:
				return readInstance(value);
		}
	} else if(value.name) {
		return eval(value.name);
	} else
		return value; // a string, boolean or number
}

function readList(value) {
	var items = value.value.map(readJSONValue);
	return new List(false, items);
}

function readCursor(value) {
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
	return new Cursor(false, iterable);
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

function writeJSONValue(value, useDbRefs) {
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
		case "List":
			return value.map(function(value) {
				return writeJSONValue(value, useDbRefs);
			});
		default:	
			if(typeof($Root) !== 'undefined' && value instanceof $Root) {
				if(useDbRefs) {
					var dbId = value.getOrCreateDbId();
					return { type: "%dbRef%", value: writeJSONValue(dbId, useDbRefs) };
				} else {
					var result = {};
					value.getAttributeNames().forEach(function(attr) {
						result[attr] = writeJSONValue(value[attr], useDbRefs);
					});
					return { type: typeName, value: result};
				}
			} else
				return value;
		}
	}
	
}
