/*
Reutiliza el ejercicio anterior: genera una apuesta al azar y unos resultados también al azar; después indica cuantos aciertos se han producido.
 */
import kotlin.random.Random
fun main() {
    println("Este programa te hace una quiniela aleatoria y te dice cuanto has ganado!")
    var resul = 0
    var tirada = 0
    var cont = 0
    for (i in 1..15) {
        tirada = Random.nextInt(1,4)
        resul = Random.nextInt(1, 4)
        when (resul) {
            1 -> println("El resultado es 1")
            2 -> println("El resultado es X")
            3 -> println("El resultado es 3")
        }
        when (tirada) {
            1 -> println("Tu tirada es 1")
            2 -> println("Tu tirada es X")
            3 -> println("Tu tirada es 3")
        }
        if (resul==tirada) {
            println("Acertaste!")
            cont++
        }
    }
    println("Has ganado $cont veces")
}
