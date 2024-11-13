/*
Diseña el programa que pida dos números n y m. Y que muestre todas las combinaciones entre los dos. Ejemplo: si n vale 2 y m 3:
n m
1 1
1 2
1 3
2 1
2 2
2 3

 */

fun main() {
    println("Este programa te pide dos numeros y te muestra todas las combinaciones entre ellos")
    println("Introduce el primer numero")
    var n = readln().toInt()
    println("Introduce el segundo numero")
    var m = readln().toInt()

    for (i in 1..n) {
        for (o in 1..m) {
            println("($i, $o)")
        }
    }
}