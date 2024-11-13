import kotlin.random.Random

/*
Realizaremos el juego de las parejas. Se inicia un vector de n casillas (siendo n un número par) y
se colocan al azar parejas de números. Ese panel se oculta al jugador al que se le mostrará un panel vacío del que irá destapando de 2 en 2.
 Si los números destapados coinciden
 se quedan visibles si no se muestran un segundo y luego se ocultan. El jugador tratará de recordar qué números eran para encontrar a su pareja.
 */

fun main() {
    var array = randomizarVector(rellenarConParejas(pedirPar()))
    var vectorjuego = IntArray(array.size)
    while (vectorjuego!=array) {
        vectorjuego = juego(array, pedirPosicion(true, array.size), pedirPosicion(false, array.size))
        escribirVectorParejas(vectorjuego)
    }


}


fun rellenarConParejas(tamanio: Int): IntArray {
    var array = IntArray(tamanio)
    var contador = 0
    var numero = 0
    var numero2 = 0
    var seguir = true
    while (contador < array.size) {
//        do {
//            numero = Random.nextInt(1,21)
//        }while (numero in array)
        do {
            seguir = false
            numero = Random.nextInt(1, 21)
            for (i in array.indices) {
                if (array[i] == numero) {
                    seguir = true
                }
            }

        } while (seguir)
        array[contador] = numero
        contador++
        numero2 = numero
        array[contador] = numero2
        contador++
//        if (contador<array.size) {
//            do {
//                var indice = Random.nextInt(contador, array.size)
//                if (array[indice] == 0) {
//                    array[indice] = numero
//                }
//            } while (array[indice] == 0)
//        }
//    contador++

    }
    return array
}

fun pedirPar(): Int {
    var numero = 0
        println("Dime un numero, que sera la cantidad de parejas que habrá")
        numero = readln().toInt()
    return numero*2
}

fun randomizarVector(array: IntArray): IntArray { //Esto lo he sacado del gpt, no se me ocurria sin el .shuffled
    for (i in array.size - 1 downTo 1) {
        val j = Random.nextInt(i + 1)
        // Intercambiar vector[i] con vector[j]
        var temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
    return array
}

fun juego(array: IntArray, posicion1: Int, posicion2: Int): IntArray {
    var arrayoculto = IntArray(array.size) { 0 }
    print("[${array[posicion1]}][${array[posicion2]}]")
    if (array[posicion1] == array[posicion2]){
        arrayoculto[posicion1] = array[posicion1]
        arrayoculto[posicion2] = array[posicion2]
    }
    escribirVectorParejas(array)
    return arrayoculto
}

fun pedirPosicion(pos1: Boolean, tamanio: Int): Int {
    var posicion = 0
    do {
        if (pos1) {
            println("Dime la primera posicion, desde 1 hasta ${tamanio}")

        } else {
            println("Dime la segundo posicion")
        }
        posicion = readln().toInt()
    } while (posicion !in 1..tamanio)

    return posicion-1
}

fun escribirVectorParejas(array: IntArray) {
    println()
    for (i in array.indices) {
        print("[${array[i]}]")
    }
}