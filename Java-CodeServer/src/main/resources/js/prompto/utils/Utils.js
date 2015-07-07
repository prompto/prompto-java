function equalObjects(o1, o2) {
	o1 = o1 || null;
	o2 = o2 || null;
	if(o1===o2) {
		return true;
	}
	if(o1===null || o2===null) {
		return false;
	}
	return o1.equals(o2);
}

function equalArrays(o1, o2) {
	o1 = o1 || null;
	o2 = o2 || null;
	if(o1===o2) {
		return true;
	}
	if(o1===null || o2===null) {
		return false;
	}
	if(o1.length !== o2.length) {
		return false;
	}
	for(var i=0;i<o1.length;i++) {
		if(!equalObjects(o1[i], o2[i])) {
			return false;
		}
	}
	return true;
}

function arrayContains(a, o) {
	for(var i=0;i<a.length;i++) {
		if(equalObjects(a[i], o)) {
			return true;
		}
	}
	return false;
}

function removeAccents(s) {
    s = s.replace(/[ÁÀÃÂÄ]/gi,"A");
    s = s.replace(/[áàãâä]/gi,"a");
    s = s.replace(/[ÉÈËÊ]/gi,"E");
    s = s.replace(/[éèëê]/gi,"e");
    s = s.replace(/[ÍÌÏÎ]/gi,"I");
    s = s.replace(/[íìïî]/gi,"i");
    s = s.replace(/[ÓÒÖÔÕ]/gi,"O");
    s = s.replace(/[óòöôõ]/gi,"o");
    s = s.replace(/[ÚÙÜÛ]/gi, "U");
    s = s.replace(/[úùüû]/gi, "u");
    s = s.replace(/[Ç]/gi, "C");
    s = s.replace(/[ç]/gi, "c");
    s = s.replace(/[Ñ]/gi, "N");
    s = s.replace(/[ñ]/gi, "n");
    return s;
};

exports.equalObjects = equalObjects;
exports.equalArrays = equalArrays;
exports.arrayContains = arrayContains;
exports.removeAccents = removeAccents;
