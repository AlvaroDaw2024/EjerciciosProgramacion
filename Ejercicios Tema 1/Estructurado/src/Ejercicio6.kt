/*
6º Calcula la raíz cuadrada de un número que pedimos por teclado
, teniendo la precaución de que el número no sea negativo; en este caso se debe informar de que la operación no es posible.
 */
import kotlin.math.sqrt

fun main() {
    var resul = 0.0
    var num = 0.0
        println("Indica aqui el numero")
        num = readln().toDouble()

    if (num < 0) {
        println("El numero no puede ser negativo")
    }

    else {
        resul = sqrt(num)
        println("La raiz cuadrada de $num es $resul")
    }

}