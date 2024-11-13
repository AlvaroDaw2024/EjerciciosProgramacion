/*
Diseña un algoritmo que muestre todos los divisores de un número. Ejemplo, si el usuario introduce un 12,
 el programa mostrará: 2,3,4,6. Si no tuviera divisores no mostrará nada, se valora que muestre al final un mensaje “no tiene divisores” caso de ocurrir.
 */

fun main () {
    var cont = 0
    println("Este programa muestra todos los divisores de un numero")
    println("Introduce un numero")
    var num = readln().toInt()

    for (i in 2..num) {
        if (num%i==0) {
            println("${num / i}")
            cont++
        }
    }
    if (cont == 0) {
        println("Este numero no tiene divisor propio")
    }
}