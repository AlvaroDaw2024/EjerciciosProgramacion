/*
Pide un número por teclado; utiliza las cadenas y sus propiedades para comprobar que el número es correcto.
 Caso de ser correcto se debe convertir en entero para poder operarlo posteriormente.
Nota: investigar cómo se pasaría de entero a cadena.
 */
fun main () {

    println("Pide un número por teclado; utiliza las cadenas y sus propiedades para comprobar que el número es correcto.")
    var numero = readln()
    /*
    var numeroentero = IntArray(numero.length) { 0 }
    var j = 0
    for (i in 0..numero.length - 1) {
        if (numero.get(i).code !in 48..57) {
            println("No hay un numero en la posicion: $i")
            j++
        } else if (numero.get(i).code in 48..57) {
            numeroentero[j] =
                numero.get(i).toString().toInt() //tambien se le puede restar el valor del '0'.code para sacarlo
            j++
        }
    }
    for (i in numeroentero.indices) {
        println(numeroentero[i])
    }

    */
    var arrays = comprobacion(numero)
    for (i in arrays.indices) {
        println(arrays[i])
    }
}

fun comprobacion (numero:String):IntArray {
    var cont = 0
    var j = 0
    var array = IntArray(numero.length) { 0 }
    while (cont < numero.length) {
        if (numero.get(cont).code <= 47 || numero.get(cont).code >= 58) {
            println("No hay un numero en la posicion: $cont")
            j++
        } else if (numero.get(cont).code >= 48 && numero.get(cont).code <= 57) {
            array[j] = numero.get(cont).toString().toInt()
            j++
        }
        cont++
    }
    return array
}