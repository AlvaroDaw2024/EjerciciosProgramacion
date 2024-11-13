/*
Determinar si un número introducido por teclado es primo o no. Un número primo solo es divisible por él mismo y por la unidad.
 */

fun main () {
    var cont = 0
    println("Este programa te dice si el numero introducido es primo")
    println("Dime el numero")
    var num = readln().toInt()
    for (i in 1..num) {
       if(num % i == 0) {
            cont++
           println("${num/i}")
       }
    }
    if (cont <=2) {
        println("$num es primo")
    }
    else {
        println("$num no es primo")
    }
}