import kotlin.math.max
import kotlin.random.Random

/*
Crea un programa modular que inicie un vector con diez números aleatorios. Después un módulo
 me indicará cual es el valor máximo y la posición que ocupa.
  Caso de haber más de un máximo me debe devolver la posición del último.
 */

fun main() {
    var array = arrayAleatorio()
    var maximo = comprobarMaximo(array)
    println("Los numeros aleatorios son:")
    for (i in array.indices) {
        println(array[i])
    }
    println("Y el maximo entre ellos es: $maximo")
}

fun arrayAleatorio(): Array<Int> {
    var array: Array<Int> = Array(10) { 0 }
    for (i in array.indices) {
        array[i] = Random.nextInt(1, 100)
    }
    return array
}

fun comprobarMaximo(array: Array<Int>): Int {
    var maximo = 0 //variable que tambien auxilia para evitar fallo!
    for (i in array.indices) {
        for (j in array.indices) {
            if (array[i] < array[j] && array[j] > maximo)
                maximo = array[j]
        }
    }
    return maximo
}