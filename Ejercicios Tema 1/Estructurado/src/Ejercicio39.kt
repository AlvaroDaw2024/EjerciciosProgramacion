import kotlin.random.Random

/*
Juego del número secreto. El ordenador ‘pensará’ un número del 1 al 100. El usuario tendrá 5 intentos para averiguarlo.
El programa le irá dando pistas del tipo mayor o menor. Al final, pase lo que pase (gane o pierda), se le preguntará al usuario si quiere continuar.
 */

fun main() {
    var num = 0
    var salir = false
    var opcion = 0
    var cont = 0
    var continuar = ""
    do {
        num = Random.nextInt(1, 101)
        cont = 0
        println("Vamos a jugar al numero secreto!")
        println("El numero esta entre el 1 y el 100")
        println("Empezamos!")
        do {
            cont++
            println("Dinos un numero")
            opcion = readln().toInt()
            if (opcion < num) {
                println("Estas por debajo!")

            } else if (opcion > num) {
                println("Estas por encima!")

            } else if (opcion == num) {
                println("Ganaste!")
                cont += 5
            }
        } while (cont < 5 )
        println("Deseas continuar?(s/n)")
        continuar = readln()
        if (continuar == "s") {
            salir = false
            println("Seguimos")
        } else if (continuar == "n") {
            salir = true
            println("Hasta luego!")
        }
    } while (!salir)
}