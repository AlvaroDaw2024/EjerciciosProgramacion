import kotlin.random.Random

/*
Genera una combinación al azar para la lotería primitiva. Los números de la lotería son 2, comprendidos del 1 al 49.
En esta versión no importa si se repite algún número.
 */

/*
fun main () {
    var num1 = 0
    var num2 = 0
    var cont = 0
    var contnum = 0
    var numrandom = 0
    do {
        println("Escribe un numero")
        num1 = readln().toInt()
        println("Escribe el segundo numero")
        num2 = readln().toInt()
    } while ((num1 !in 1..49) || (num2 !in 1..49))
    do {
        numrandom = Random.nextInt(1,50)
        println("El numero que ha salido es el $numrandom")
        if (numrandom==num1 || numrandom==num2){
            contnum++
        }
        cont++
    } while (cont != 10)
    println("Has ganado $contnum veces, que son ${contnum*50}€")
}
*/
fun main () {
    var numrandom = 0
    var contnum = 0
    var num1 = 0
    var num2 = 0
    do {
        println("Escribe el primer numero")
        num1 = readln().toInt()
        println("Escribe el segundo numero")
        num2 = readln().toInt()
    } while ((num1 !in 1..49) || (num2 !in 1..49))
    println("Cuantas veces quieres tirar?")
    for (i in 1..readln().toInt()) {
        numrandom = Random.nextInt(1, 50)
        println("El numero que ha salido es el $numrandom")
        if (numrandom == num1 && numrandom == num2) {
            contnum = contnum + 2
        }
        else if (numrandom == num1 || numrandom == num2) {
            contnum++
        }
    }
    println("Has ganado $contnum veces, que son ${contnum*50}€")
}
