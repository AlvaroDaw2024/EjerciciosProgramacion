/*
Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la cadena buscada.
 El programa indicará cuantas veces aparece la segunda cadena en la primera.
 */

fun main () {
    println("Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la cadena buscada." +
            " El programa indicará cuantas veces aparece la segunda cadena en la primera.")
    var cadena1 = pedirDatosString("Dime la cadena grande en la que vamos a buscar")
    var cadena2 = pedirDatosString("Dime la cadena que vamos a buscar")
    var palabra=""
    var contador=0
    for (i in 0..cadena1.length-1) {
        palabra=palabra+cadena1.get(i)
        if (palabra==cadena2) {
            contador++
        }
        if (cadena1.get(i)==' ') {
            palabra=""
        }
    }
    println("La cadena $cadena2 aparece $contador veces")
}