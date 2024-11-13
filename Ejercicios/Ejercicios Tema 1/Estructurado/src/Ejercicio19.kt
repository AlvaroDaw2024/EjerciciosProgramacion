/*
Realiza un algoritmo que resuelva una ecuación de segundo grado.
El programa pedirá por teclado los tres coeficientes y mostrará las posibles soluciones:
 No tiene solución, una única solución (y su valor) o dos soluciones (y sus valores).
 */
import kotlin.math.sqrt
fun main () {
    println("Este programa resuelve una ecuacion de segundo grado")
    println("Ingrese el coeficiente a:")
    var a = readln().toInt()
    if (a == 0) {
        println("El coeficiente a debe ser distinto de 0 para que sea una ecuacion de segundo grado")
        return
    }
    println("Ingrese el coeficiente b:")
    var b = readln().toDouble()
    println("Ingrese el coeficiente c:")
    var c = readln().toDouble()

    var discriminante:Double = b * b - 4 * a * c


    if (discriminante > 0) {
        var x1 = (-b + sqrt(discriminante)) / (2 * a)
        var x2 = (-b - sqrt(discriminante)) / (2 * a)
        println("La ecuacion tiene dos soluciones: x1=$x1 y x2=$x2")
    }

    else if (discriminante == 0.0) {
        var x = -b / (2 * a)
        println("La ecuacion tiene una solucio: x=$x")
    }
    else {
        println("No tiene solucion real")
    }

}