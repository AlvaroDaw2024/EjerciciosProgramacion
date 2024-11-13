/*
Diseña el algoritmo que indique el mayor de una serie de números que introducimos por teclado.
 Crea dos versiones: en la primera la cantidad está definida en la segunda será indefinida.
 */

fun main() {
    var numcomp = 0
    var num = 0
    var numayor = 0
    var cont = 0
    println("Este programa te indica el mayor de una serie de números que introducimos por teclado")
    println("Cuantos numeros quieres comparar")
    numcomp = readln().toInt()
    do {
        cont++
        println("Dime un numero")
        num = readln().toInt()
        if (numayor < num) {
            numayor = num
        }
    } while (cont != numcomp)
    println("De los $numcomp numeros que has introducido, el mayor es $numayor")
}