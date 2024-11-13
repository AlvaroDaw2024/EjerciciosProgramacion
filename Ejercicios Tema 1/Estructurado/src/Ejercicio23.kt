/*
Calcula el factorial de un número entero.
 El factorial es el resultado de multiplicar ese número por todos los números menores que él. Ejemplo: 4! = 4*3*2*1 = 24.
 */

fun main () {
    println("Este programa te calcula el factorial de un numero entero!")
    println("Introduce el numero")
    var num = readln().toInt()
    var cont = 1
    do {
        num = num * cont
        cont++
        println("$num")
    } while (num >= cont)
    println("$num")
}
