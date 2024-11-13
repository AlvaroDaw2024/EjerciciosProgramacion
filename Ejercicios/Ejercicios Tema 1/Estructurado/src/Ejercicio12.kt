/*
Diseña un algoritmo parecido al anterior en el que se indique si tres números pedejeidos son consecutivos o no.
 */

fun main() {
    println("Este programa te dice si los tres numeros que has escrito son consecutivos o no")
    println("Escribe el primer numero")
    var n1 = readln().toInt()
    println("Escribe el segundo numero")
    var n2 = readln().toInt()
    println("Escribe el tercer numero")
    var n3 = readln().toInt()

    if ((n2==n1+1) && (n3==n2+1)) {
        println("Los numeros son consecutivos")
    }
    else {
        println("Los numeros NO son consecutivos")
    }
}