/*
Calcula la media de diez números que pedimos por teclado.
 Generaliza la solución para una cantidad cualquiera de números que pediremos al principio.
 */

fun main () {
    var num = 0
    var cont = 0
    var suma = 0
    println("Este programa calcula la media de diez números que pedimos por teclado.")
    println("Y ahora podemos poner la cantidad de numeros que queramos!")
    var cantidad = readln().toInt()
    do {
        println("Escribe")
        num = readln().toInt()
        suma = suma + num
        cont++
    } while (cont != cantidad)
    println("La media de los $cantidad numeros que has introducido es: ${suma/cantidad}")
}
/*
fun main () {
    var suma = 0
    var num = 0
    println("Este programa calcula la media de diez números que pedimos por teclado.")
    println("Y ahora podemos poner la cantidad de numeros que queramos!")
    var cantidad = readln().toInt()
    var cantidadfor = cantidad
    println("Ahora escribe los numeros")
    for (i in 1..cantidad) {
        println("Te quedan ${cantidadfor--}")
        num = readln().toInt()
        suma = suma + num
    }
    println("La media de los numeros que has introducido es ${suma/cantidad}")
}
*/
