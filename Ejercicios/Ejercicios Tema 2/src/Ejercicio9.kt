/*
Escribir un programa que cuente el número de palabras en un texto.
 */

fun main () {
    println("Escribir un programa que cuente el número de palabras en un texto.")
    var palabra=""
    var contador=0
    var texto = pedirDatosString("Escribe aqui el texto").trim()
    for (i in 0..texto.length-1) {
        if ((i==0 ||
                    texto[i - 1] == ' ') && texto[i] != ' ') {
            contador++
        }
    }
    println("La frase tiene $contador palabras")
}