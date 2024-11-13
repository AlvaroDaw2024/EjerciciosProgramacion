import kotlin.concurrent.thread
import kotlin.random.Random

/*
Escribe un programa que inicie un vector con números al azar de 1 a 100.
 Después crearemos un módulo al que le pasemos un número y me devuelva cuantas veces aparece ese número en el vector.
 */

fun main () {
    println("Dime un numero y te digo cuantas veces sale en este vector")
    var numero = readln().toInt()
    var array=arrayAleatorio2()
    var contador = contadorRepeticiones(numero,array)
    println("El numero $numero sale $contador veces")
    println("Y para comprobarlo vamos a printear el array")
    Thread.sleep(2000)
    for (i in array.indices) {
        println(array[i])
    }
}

fun arrayAleatorio2(): Array<Int> {
    var array: Array<Int> = Array(10) { 0 }
    for (i in array.indices) {
        array[i] = Random.nextInt(1, 10)
    }
    return array
}

fun contadorRepeticiones(numero:Int,array: Array<Int>):Int{
    var contador = 0
    for (i in array.indices) {
        if (array[i] == numero){
            contador++
        }
    }
    return contador
}