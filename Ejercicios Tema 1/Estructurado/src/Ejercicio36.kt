/*
Genera combinaciones al azar para una quiniela de fútbol. Recordemos que son 15 resultados: 1, X y 2
 */
import kotlin.random.Random
/*
fun main() {
    println("Este programa te genera una quiniela al azar")
    var resul = 0
    for (i in 1..15) {
        resul = Random.nextInt(1, 4)
        when (resul) {
            1 -> println("El resultado es 1")
            2 -> println("El resultado es X")
            3 -> println("El resultado es 3")
        }
    }
}
*/
fun main() {
    println("Este programa te genera una quiniela al azar")
    var resul = 0
    var cont = 0
    do {
        cont++
        resul = Random.nextInt(1, 4)
        when (resul) {
            1 -> println("El resultado es 1")
            2 -> println("El resultado es X")
            3 -> println("El resultado es 3")
        }
    } while (cont != 15)
}