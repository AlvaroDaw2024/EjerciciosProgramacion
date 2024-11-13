/*
Realiza un conversor de grados Centígrados a grados Farenheit.
 Nuestro algoritmo debe poder hacer la conversión en ambos sentidos.
 Formula: F = (9/5*C)+32
 */

fun main (){

        println("Este programa convierte grados centigrados a Farenheit y viceversa")
        println("¿Que quieres convertir?")
        println("1.- Grados Centigrados a Farenheit")
        println("2.- Grados Farenheit a Centigrados")
        var dec = readln()
        if (dec == "1") {
            println("Escribe los grados centigrados")
            var C:Double = readln().toDouble()
            var totalf:Double = (C * 9 / 5) + 32
            println("La conversion es $totalf")
        }
        else if (dec == "2") {
            println("Escribe los grados farenheit")
            var F:Double = readln().toDouble()
            var totalc:Double = (F - 32) * 5 / 9
            println("La conversion es $totalc Cº")
        }
        else {
            println("Opcion no valida")
        }
}

  // SE puede hacer de otra manera con los when
   /* while (true) { //Esto hace que se repita el programa hasta que le demos a salir
        println("Este programa convierte grados centigrados a Farenheit y viceversa")
        println("¿Que quieres convertir?")
        println("1.- Grados Centigrados a Farenheit")
        println("2.- Grados Farenheit a Centigrados")
        println("3.- Salir")
        when (readln()) {
            "1" -> {
                println("Escribe los grados centigrados")
                var CEL = readln().toDouble()
                var totalf:Double = (CEL * 9 / 5) + 32
                println("La conversion es $totalf F")
            }

            "2" -> {
                println("Escribe los grados fahrenheit")
                var F = readln().toDouble()
                var totalc:Double = (F - 32) * 5 / 9
                println("La conversion es $totalc Cº")
            }
            "3" -> {
                println("Saliendo del programa.")
                return
            }
            else -> {
                println("Opcion no valida")
            }
       }
    }
} */
//fun CentoFah(C: Double):Double {
//  return (CEL * 9 / 5) + 32

//fun FahtoCen(F: Double):Double {
//        return (FAH - 32) * 5 / 9

