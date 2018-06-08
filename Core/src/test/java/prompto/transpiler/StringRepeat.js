if (!String.prototype.repeat) {
  String.prototype.repeat = function (count) {
    "use strict";
    if (this == null)
      throw new TypeError("ne peut convertir " + this + " en objet");
    var str = "" + this;
    count = +count;
    if (count != count)
      count = 0;
    if (count < 0)
      throw new RangeError("le nombre de répétitions doit être positif");
    if (count == Infinity)
      throw new RangeError("le nombre de répétitions doit être inférieur à l'infini");
    count = Math.floor(count);
    if (str.length == 0 || count == 0)
      return "";
    // En vérifiant que la longueur résultant est un entier sur 31-bit
    // cela permet d'optimiser l'opération.
    // La plupart des navigateurs (août 2014) ne peuvent gérer des
    // chaînes de 1 << 28 caractères ou plus. Ainsi :
    if (str.length * count >= 1 << 28)
      throw new RangeError("le nombre de répétitions ne doit pas dépasser la taille de chaîne maximale");
    var rpt = "";
    for (var i = 0; i < count; i++) {
      rpt += str;
    }
    return rpt;
  }
}