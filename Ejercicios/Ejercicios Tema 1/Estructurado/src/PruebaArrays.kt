import kotlin.random.Random

fun main () {
    var numrandom = 0
    var contnum = 0
    var num1 = 0
    var num2 = 0
    var tiradas = 0
    do {
        println("Escribe el primer numero")
        num1 = readln().toInt()
        println("Escribe el segundo numero")
        num2 = readln().toInt()
        println("Cuantas tiradas?")
        tiradas = readln().toInt()
    } while ((num1 !in 1..49) || (num2 !in 1..49))
    for (i in 1..tiradas) {
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

