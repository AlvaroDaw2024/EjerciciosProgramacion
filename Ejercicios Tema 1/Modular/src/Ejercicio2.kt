/*
Diseña un programa modular que calcule el área y la circunferencia de un círculo cuyo radio se debe preguntar al usuario.
 */
import kotlin.math.PI
import kotlin.math.sqrt

fun main () {
    var radio = pedirDato()
    area(radio)
    circunferencia(radio)
}

fun pedirDato():Int {
    println("Dime el radio del circulo")
    return readln().toInt()
}

fun circunferencia(r:Int) {
    println("La circunferencia es ${2 * PI * r}")
}

fun area(r:Int) {
    println("El area es ${PI * sqrt(r)}")
}
