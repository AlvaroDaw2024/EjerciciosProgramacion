/*
La calculadora. Diseña un algoritmo que pida dos números y un operador (una operación aritmética básica: sumar, restar, multiplicar o dividir).
 Se debe mostrar el resultado de dicha operación. Controla el posible error como la división por cero
, en este caso se indicará que no se puede realizar. El ejercicio se debe repetir indefinidamente hasta que el usuario decida terminar.
 */

fun main () {
    println("Calculadora")
    var salir = 0
    var n1 = 0.0
    var n2 = 0.0
    var resul = 0.0
    do {
        println("Que operación deseas realizar?")
        println("1.- Sumar")
        println("2.- Restar")
        println("3.- Multiplicar")
        println("4.- Dividir")
        println("5.- Salir")


        var opcion = readln()
        println("Dime el primer numero")
        n1 = readln().toDouble()
        println("Dime el segundo numero")
        n2 = readln().toDouble()

        when (opcion) {
            "1", "Sumar", "sumar", "+" -> {
                resul = n1 + n2
                println("$n1 + $n2 da como resultado: $resul")
            }

            "2", "Restar", "restar", "-" -> {
                resul = n1 - n2
                println("$n1 - $n2 da como resultado: $resul")
            }

            "3", "Multiplicar", "multiplicar", "*" -> {
                resul = n1 * n2
                println("$n1 * $n2 da como resultado: $resul")
            }

            "4", "Dividir", "dividir", "/" -> {
                if (n1 == 0.0 || n2 == 0.0) {
                    println("ERROR")
                } else {
                    resul = n1 / n2
                    println("$n1 / $n2 da como resultado: $resul")
                }
            }

            "5", "Salir", "salir" -> {
                salir = -1
            }

            else -> {
                println("Opcion incorrecta")
            }
        }

    } while (salir > -1)

}