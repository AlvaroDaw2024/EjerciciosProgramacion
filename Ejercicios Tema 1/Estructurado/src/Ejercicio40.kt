/*
Realiza un ejercicio en el que se muestre un menú que indique que ejercicio quiere realizar: 23, 29, 31 o salir.
 El programa realizará esos ejercicios hasta que el usuario indique que quiere salir.
 */

fun main() {
    var salir = 0
    do {
        println("Elige un ejercicio que quieras hacer")
        println("1.- Ejercicio 23")
        println("2.- Ejercicio 29")
        println("3.- Ejercicio 31")
        println("4.- Salir")
        var opcion = readln()
        when (opcion) {
            "1" -> {

            }

            "2" -> {

            }

            "3" -> {

            }

            "4" -> {
                salir = -1
            }
            else ->{
                println("Opcion incorrecta")
            }
        }
    } while (salir > -1)
}