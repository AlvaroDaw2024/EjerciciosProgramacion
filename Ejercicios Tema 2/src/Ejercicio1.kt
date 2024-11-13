/*
Pedir dos cadenas por teclado y compararlas en: logitud, alfabeticamente y si son iguales
 */
fun main () {
    println("Este programa te pide dos cadenas por teclado y las compara en: longitud, alfabeticamente y si son iguales")
    var c1 = pedirDatosString("Dime el primer dato")
    var c2 = pedirDatosString("Dime el segundo dato")

    println("La longitud de $c1 es ${c1.length}")
    println("La longitud de $c2 es ${c2.length}")
    var mayor = maxOf(c1,c2)
    println("$mayor es el mas largo")

    if (compararString(c1, c2) < 0) {
        println("$c1 va primero")
    } else if (compararString(c1, c2) > 0) {
        println("$c2 va primero")
    } else {
        println("Las cadenas son iguales")
    }

}

fun pedirDatosString(mensaje:String):String {
    println(mensaje)
    return readln()
}

fun compararString(v1:String, v2:String):Int {
    return v1.lowercase().compareTo(v2)
}