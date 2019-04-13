function readJSONValue(value) {
	if(value==null)
		return null;
	else if(Array.isArray(value)) {
		var items = value.map(readJSONValue);
		return new List(false, items);
	} else if(typeof(value)==typeof({})) {
		switch(value.type) {
			case "Uuid":
				return UUID.fromString(value.value);
			case "Date":
				return LocalDate.parse(value.value);
			case "Time":
				return LocalTime.parse(value.value);
			case "DateTime":
				return DateTime.parse(value.value);
			default:
				return readJSONInstance(value);
			}	
	} else
		return value;
}

function readJSONInstance(value) {
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
			if(value instanceof $Root) {
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
