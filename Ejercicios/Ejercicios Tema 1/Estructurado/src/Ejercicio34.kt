/*
Reutiliza el ejercicio anterior para mostrar los números primos que hay del 1 al 100
 */
fun main() {
    println("Este programa muestra los numeros primos del 1 al 100")
    for (i in 2..100) {
        var cont = 0
        for (j in 1..i) {
            if (i % j == 0) {
                cont++
                // println("${i / j}")
            }
        }
        if (cont == 2) {
            println("$i es primo")
        }

    }
}