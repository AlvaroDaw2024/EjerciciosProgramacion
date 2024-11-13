/*
Diseña un programa modular que calcule el área y la circunferencia de un círculo cuyo radio se debe preguntar al usuario.
 */
import kotlin.math.PI

fun main () {
    var radio:Double = pedirDato()
    area(radio)
    circunferencia(radio)
}

fun pedirDato():Double {
    println("Dime el radio del circulo")
    return readln().toDouble()
}

fun circunferencia(r:Double) {
    println("La circunferencia es ${2 * PI * r}")
}

fun area(r:Double) {
    println("El area es ${PI * (r*r)}")
}
