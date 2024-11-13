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
        arrayOf("Mundo", "Casas", "Perro", "Libro", "Arbol", "Gatos", "Risas", "Playa", "Silla", "Cielo")
    var palabrajuego = arraypalabras[Random.nextInt(0, 10)].lowercase()
    var palabrafinal = ""
    var stringbuilderjuego = StringBuilder(palabrajuego)
    println("La letra inicial es ${palabrajuego[0]}")

    /*
    for (i in 0..palabrajuego.length - 1) {
        palabrafinal=palabrafinal + "_"
    }
     */
    for (i in 0..palabrajuego.length - 1) {
        stringbuilderjuego.setCharAt(i, '_')
    }
//var contador = 0
    while (cont < 5 && !ganar) {

        do {
            palabranterior = palabra
            println("Dime una palabra de cinco letras")
            palabra = readln()
        } while (palabra.length != 5 || palabra == palabranterior)
        /*
        for (i in 0..palabra.length - 1) {
            if (palabra[i] == palabrajuego[i]) {
                palabrafinal = palabrafinal + palabra[i]
            } else {
                if (palabra[contador] == palabrajuego[i]) {
                    palabrafinal = palabrafinal + '*'
                }
            }
            contador++
        }



         */
        var contador = 0
        var encontrar = false
        for (i in 0..palabrajuego.length - 1) {
            encontrar = false
            contador = 0

            if (palabra[i] == palabrajuego[i]) {
                palabrafinal = palabrafinal + palabra[i]
            } else if (palabra[i] != palabrajuego[i]) {
                do {
                    if (palabra[contador] == palabrajuego[i]) {
                        palabrafinal = palabrafinal + "*"
                        encontrar = true
                    }
                    contador++
                } while (!encontrar && contador < palabrajuego.length)
                  if (!encontrar) {

                          palabrafinal = palabrafinal + "_"
                  }

            }
        }
        println(palabrafinal)
        /*
            for (i in 0..4) {
                if (palabrajuego.get(i) == palabra.get(i)) {
                    stringbuilderjuego.setCharAt(i, palabra.get(i))

                } else {
                    for (j in 0..4) {
                        if (palabra.get(j) == palabrajuego.get(i))//&& palabrajuego.get(j) != palabra.get(j) No hace falta
                            stringbuilderjuego.setCharAt(j, '*')
                    }
                }
            }
        */
        cont++
        println("Te quedan ${5 - cont} intentos")
        // println(stringbuilderjuego)
        println(palabrafinal)
        palabrafinal = ""
        /*
                for (i in 0..palabrajuego.length - 1) {
                    palabrafinal=palabrafinal+'_'
                }
        */
        for (i in 0..palabrajuego.length - 1) {
            stringbuilderjuego.setCharAt(i, '_')
        }
        if (palabra == palabrajuego) {
            ganar = true
            println("Ganaste!")
        } else if (cont == 5) {
            println("Perdiste!")
            println("La palabra era $palabrajuego")
        }
    }
}

//3 resultados, 1 si es la misma, 2 si esta la letra pero no en la posicion y 3 si no es ninguna de las demas