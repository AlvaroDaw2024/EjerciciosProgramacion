/*
Dados dos números enteros, realizar el algoritmo que calcule el cociente y el resto mediante restas sucesivas.
Ejemplo: 18 : 4
Se irá restando 18 – 4 = 14; 14 – 4 = 10; 10 – 4 = 6; 6 – 4 = 2
hasta que el resultado de la resta (2) es menor que el divisor (4).
Por lo tanto el cociente es el número de restas que se han hecho (4) y el resto es el valor de la última resta (2).

 */

fun main () {
    println("Este programa te calcula el cociente y el resto de dos numeros enteros")
    println("Escribe el primer numero")
    var n1 = readln().toInt()
    println("Escribe el segundo numero")
    var n2 = readln().toInt()
    var contador = 0
    var resto = 0

    if (n1 >= n2) {
        println("El primero numero es mayor")
        do {
            n1 = n1 - n2
            contador++
            println("$n1 de resto y llevamos $contador operaciones")
        } while (n1 >= n2)
    }
    else if (n2 >= n1) {
        println("El segundo numero es mayor")
        do {
            n2 = n2 - n1
            contador++
            println("$n2 de resto y llevamos $contador operaciones")
        } while (n2 >= n1)
    }
}