/*
Determinar el número de cifras de un número de, como máximo, cinco cifras.
 Ejemplos: 9560 debe indicar que tiene 4 cifras; -369 tiene 3 cifras.
 */

fun main() {
    var num = 0
    var contador = 0
    do {
        println("Este programa te determina el numero de cifras de un numero")
        println("Escribe el numero")
        num = readln().toInt()
        var contador = 0
    } while ((num > 99999) || (num < -99999))
    do {
        num = num / 10
        contador++
        println("$num")
    } while (num != 0)
    println("$contador cifras")
}