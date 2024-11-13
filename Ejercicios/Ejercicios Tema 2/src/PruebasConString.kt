fun main () {
    var cadena:String = "El nartes es un dia de lluvia   "
    println(cadena.length)
    println(cadena.trim().length)

    var cadenaBlancos = "         tengo espacios    "
    println(cadenaBlancos.length)
    println(cadenaBlancos.trim().length)

    println(cadenaBlancos.trim().substring(5))
    println(cadenaBlancos.trim().substring(6,10))


    var v1 = "a"
    var v2 = "d"

    println(v1.compareTo(v2))
    println(v2.compareTo(v1))

}