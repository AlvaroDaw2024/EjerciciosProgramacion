/*
Calcula la raíz cuadrada de un número que pedimos por teclado, teniendo la
precaución de que el número no sea negativo; en este caso se debe informar de que la
operación no es posible. Se debe realizar modularmente.
 */
import kotlin.math.sqrt
fun main () {
    presentacion("calcula la raiz cuadrada del numero que introduzcas")
    var num:Double = pedirDatos("Escribe aqui el numero")
    var comp = comprobacion(num)
    if (comp == false) {
        println("No puede ser negativo")
    }
    else {
        raiz(num, "La raiz de $num es: ")
    }
}

fun presentacion(mensaje: String) {
    println("Este programa" + mensaje)
}

fun pedirDatos(mensaje: String):Double {
    println(mensaje)
    var dato = readln().toDouble()
    return dato
}

fun comprobacion (n: Double):Boolean {
    var comp:Boolean
    if (n < 0) {
        comp = false
    }
    else {
        comp = true
    }
    return comp
}

fun raiz (n:Double , mensaje: String) {
    var raiz = sqrt(n)
    println(mensaje+raiz)
}