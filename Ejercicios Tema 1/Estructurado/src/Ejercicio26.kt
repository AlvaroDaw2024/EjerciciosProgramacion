/*
Mostrar el mensaje: “¿Desea terminar (s/n)?”.
El programa terminará cuando el usuario teclee ‘s’ o ‘S’; en otro caso el programa continuará indefinidamente.
 */

fun main () {
    var option:String
    do {
        println("¿Desea terminar (s/n)?")
        option = readln()
    } while (option != "s" && option != "S")
    println("Saliendo")
}