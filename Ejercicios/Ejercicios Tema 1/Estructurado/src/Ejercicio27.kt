/*
Diseña un algoritmo que pida números hasta que se le introduzca un número mayor que 100.
 */

fun main() {
    println("Este programa te pide numeros hasta que introduzcas uno mayor que 100")
    var num:Int
    do {
        println("Introduce un numero")
        num = readln().toInt()
    } while (num < 101)
    println("Saliendo")
}
