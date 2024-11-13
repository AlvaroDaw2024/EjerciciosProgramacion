/*
El juego podía considerarse una mezcla entre el Bingo y el Master Mind.
Las parejas de concursantes tenían que adivinar palabras de 5 letras, en un máximo de 5 intentos.
 Se les concedía la letra inicial y cuando decían una palabra, se les indicaba
  si alguna de las letras utilizadas formaba parte de la palabra oculta. Si la letra estaba en el sitio exacto,
 se recuadraba de rosa, y si la letra estaba en la palabra, pero no en el sitio exacto, se circulaba de amarillo.
 */
import kotlin.random.Random

fun main() {
    println("Juego del Lingo")
    var ganar = false
    var cont = 0
    var palabra = ""
    var palabranterior = ""
    var arraypalabras: Array<String> =
        arrayOf("Mundo", "Casas", "Perro", "Libro", "Arbol", "Gatos", "Risas", "Playa", "Silla", "Cielo") //un array con palabras del gpt
    var palabrajuego = arraypalabras[Random.nextInt(0, 10)].lowercase() //la ponemos en lowercase que luego hay lios y ademas es aleatoria!
    var palabrafinal = ""
    println("La letra inicial es ${palabrajuego[0]}")

    while (cont < 5 && !ganar) {

        do {
            palabranterior = palabra
            println("Dime una palabra de cinco letras")
            palabra = readln().lowercase()
        } while (palabra.length != 5 || palabra == palabranterior)
        var contador = 0 //ninguna de estas dos se usan fuera del while asique las nombro aqui
        var encontrar = false
        for (i in 0..palabrajuego.length - 1) {
            encontrar = false //reiniciamos el encontrar y el contador
            contador = 0

            if (palabra[i] == palabrajuego[i]) { //Esta es sencilla, si la letra de la palabra y la letra del juego es la misma la pone
                palabrafinal = palabrafinal + palabra[i]
            }
            else {
                do {
                    if (palabra[i] == palabrajuego[contador]) { //si la palabra de i es igual a la de contador agrega un * y se sale del bucle
                        palabrafinal = palabrafinal + "*" //importante el orden, con palabra[contador] y palabrajuego[i]  pone el orden mal aunque """funciona"""
                        encontrar = true
                    }
                    contador++
                } while (!encontrar && contador < palabrajuego.length)
                if (!encontrar) { //si despues de pasar los otros aun nada pues agrega un guion bajo

                    palabrafinal = palabrafinal + "_"
                }

            }
        }
        println(palabrafinal)

        cont++
        println("Te quedan ${5 - cont} intentos")
        println(palabrafinal)
        palabrafinal = ""//reinicio palabra que si no no paran de sumarse
        if (palabra == palabrajuego) { //si son iguales pues ganas menuda sorpresa
            ganar = true
            println("Ganaste!")
        } else if (cont == 5) {
            println("Perdiste!")
            println("La palabra era $palabrajuego")
        }
    }
}
