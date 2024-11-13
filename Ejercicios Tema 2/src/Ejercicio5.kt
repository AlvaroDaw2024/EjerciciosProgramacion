/*
Leer una frase y encontrar la palabra de mayor longitud.
 El programa debe imprimir tanto la palabra como el número de caracteres de la misma.
 */
/*
fun main () {
    println("Dime una frase y te digo la palabra mas larga y te digo la palabra y el numero de caracteres de la misma")
    var frase = readln()
    var palabra = ""
    var espacio = ' '
    var contador = 0
    var mayorpalabra = 0
    var palabrafinal = ""
    for (i in 0..frase.length - 1) {
        contador++
        palabra = palabra + frase.get(i)
        if (frase.get(i) == espacio) {
            contador = 0
            palabra = ""
        }
        if (mayorpalabra < contador) {
            mayorpalabra = contador
        }
        if (mayorpalabra == palabra.length) {
            palabrafinal = palabra
        }


    }
    println("La palabra mas larga es $palabrafinal")
    println("Y tiene ${palabrafinal.length} letras")
}



fun main () {
    println("Dime una frase y te digo la palabra mas larga y te digo la palabra y el numero de caracteres de la misma")
    var frase = readln()
    var palabra = ""
    var espacio = ' '.code
    var cont=0
    var contador = 0
    var mayorpalabra = 0
    var palabrafinal = ""
    while (cont != frase.length-1) {
        cont++
        contador++
        palabra = palabra + frase.get(cont)

        if (frase.get(cont).code == espacio) {
            contador = 0
            palabra = ""
        }
        if (mayorpalabra < contador) {
            mayorpalabra = contador
        }
        if (mayorpalabra == palabra.length) {
            palabrafinal = palabra
        }


    }
    println("La palabra mas larga es $palabrafinal")
    println("Y tiene ${palabrafinal.length} letras")
}
*/
fun  main () {
    println("Dime una frase y te digo la palabra mas larga y te digo la palabra y el numero de caracteres de la misma")
    var frase = readln()
    var palabra = ""
    var espacio = ' '
    var cont=0
    var contador=0
    var mayorpalabra = 0
    var palabrafinal = ""

    while (contador <= frase.length-1) {
        cont = contador
        while (frase.get(cont) != espacio) {
            palabra = palabra + frase.get(cont)
            cont++
            if (mayorpalabra < cont) {
                mayorpalabra = cont
            }
            if (mayorpalabra == palabra.length) {
                palabrafinal = palabra
            }
        }
        contador++
        cont=0
        palabra=""
    }
    println("La palabra mas larga es $palabrafinal")
    println("Y tiene ${palabrafinal.length} letras")
}
