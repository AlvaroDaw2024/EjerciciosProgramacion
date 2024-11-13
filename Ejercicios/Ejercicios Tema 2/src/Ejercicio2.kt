import kotlin.system.exitProcess

/*
Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y devuelva esta cadena invertida
. Convierte la cadena resultante en mayúsculas.
 */
fun main () {
    println(intro("solicita al usuario la introducción de una cadena de caracteres y devuelva esta cadena invertida"))
    var cadena = pedirDatosString("Dime la cadena")
    println(cadena)
    println(cadena.reversed())
    println(cadena.reversed().uppercase())
    println(invertirCadena(cadena))

}

internal fun intro(mensaje:String) {
    println("Este programa"+ mensaje)
}


fun invertirCadena(cadena:String):String {
    var frase =""
    for (i in cadena.length-1 downTo(0)) {
        frase = (frase + cadena.get(i))
    }
    return frase
}