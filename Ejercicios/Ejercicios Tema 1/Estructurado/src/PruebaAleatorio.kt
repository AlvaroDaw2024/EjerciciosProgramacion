import kotlin.random.Random
fun main () {
    var num = 0
    var cont = 0
    do {
        println("Este programa te saca un numero aleatorio")
        num = Random.nextInt(1, 100000)
        println("$num")
        cont++
    } while (num != 1)
    println("Tas gastao $cont tiradas, que son ${cont*50}€")
}