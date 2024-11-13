/*
Calcula cual es el mayor de tres números que se piden por teclado
 */

fun main() {
    println("Escribe tres numeros y este programa te indica cual es el mayor")
    println("Escribe el primer numero")
    var n1 = readln().toInt()
    println("Escribe el segundo numero")
    var n2 = readln().toInt()
    println("Escribe el tercer numero")
    var n3 = readln().toInt()

    if ((n1 > n2) && (n1 > n3)) {
        println("El primer numero introducido: $n1 es el mayor")
    }
    else if ((n2 > n1) && (n2 > n3)) {
        println("El segundo numero introducido: $n2 es el mayor")
    }
    else if ((n3 > n1) && (n3 > n2)) {
        println("El tercer numero introducido: $n3 es el mayor")
    }
    else {
        println("Los numeros son iguales")
    }
}