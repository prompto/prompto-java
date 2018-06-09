if (!Object.is) {
  Object.is = function(v1, v2) {
    // Algorithme SameValue
    if (v1 === v2) { //Étapes 1-5, 7-10
      //Étapes 6.b-6.b +0 !=-0
      return v1 !== 0 || 1 / v1 === 1 / v2; 
    } else {
      //Étapes 6.a: NaN == NaN
      return v1 !== v1 && v2 !== v2;
    }
  };
}