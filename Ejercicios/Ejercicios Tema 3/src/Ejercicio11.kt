import kotlin.random.Random

/*
Diseña un programa modular que inicie un vector de 20 posiciones con números al azar del 1 al 10.
Después pide otro vector de tres posiciones por teclado.
Crea un módulo al que le pasemos ambos vectores y nos calcule la posición en la que existe alguna repetición del vector más pequeño en el primero.
 */
fun main () {
println("Dime tres numeros del 1 al 10")
    var array=IntArray(3)
    for (i in array.indices) {
        array[i]= readln().toInt()
    }
    var arraygrande=vectorEjercicio10()
    printearArray(arraygrande)
    comprobarRepeticion(arraygrande,array)
}

fun vectorEjercicio10():IntArray{
    var array=IntArray(20){0}
    for (i in array.indices) {
        array[i]=Random.nextInt(1,11)
    }
    return array
}

fun comprobarRepeticion(arraygrande: IntArray, arraypequeño: IntArray) { //de momento no funciona bien, lo subo igual
//    var contador = 0
//    var contpequeño = 0
//    do {
//        if (arraygrande[contador] == arraypequeño[contpequeño]) {
//            if (arraygrande[contador + 1] == arraypequeño[contpequeño + 1]) {
//                if (arraygrande[contador + 2] == arraypequeño[contpequeño + 2]) {
//                    println("Se repite en la posicion: $contador")
//                }
//
//            }
//        }
//        contador++
//    } while (contador < arraygrande.size-2)

    var contador = 0
    var contpequeño = 0
    while (contador < arraygrande.size) {
        var sumar = 0
        while ((sumar < arraypequeño.size) && (arraygrande[contador + sumar] == arraypequeño[contpequeño + sumar])) {
            sumar++
        }
        if (sumar == arraypequeño.size) {
            println("Se repite en la posicion: $contador")
        }
        contador++
    }
}

