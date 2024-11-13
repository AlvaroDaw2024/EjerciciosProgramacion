import kotlin.concurrent.thread
import kotlin.random.Random

/*
Repetir el ejercicio anterior pero ahora, después de rellenar el vector, se le pasará un número al módulo
y debe devolver la posición de la primera aparición de ese número en el vector; devolverá -1 si ese número no está en el vector.
 */

fun main () {
    println("Dime un numero y te digo cuantas veces sale en este vector")
    var numero = readln().toInt()
    var array=arrayAleatorio2()
    var contador = contadorRepeticiones(numero,array)
    println("El numero $numero sale $contador veces")
    println("Y la primera posicion esta en el numero")
    println(devolverPosicion(array,numero))
    println("Y para comprobarlo vamos a printear el array")
    Thread.sleep(2000)
    for (i in array.indices) {
        println(array[i])
    }
}

fun devolverPosicion(array:Array<Int>, numero:Int):Int{
    var contador=0
    var encontrar=false
    var posicion=0
    var cont=0
    do {
        if (numero==array[contador]){
            encontrar=true
            posicion=contador+1
        }
        contador++
    } while (contador<array.size && !encontrar)
    if (!encontrar) {
        posicion=-1
    }
    return posicion
}

