import kotlin.random.Random

/*
La mosca se posicion aleatoriamente
 */
fun main () {
    var mosca = IntArray(10) { 0 }
    var ganar = false
    var intentos = 0
    var posicion=0
    var tamaño=mosca.size-1
    mosca = randomizarMosca(mosca)
    while (!ganar) {
//        for (i in mosca.indices) { Es para saber donde esta la mosca
//            if (mosca[i] == 1) {
//                println(i + 1)
//            }
//        }

       do {
            println("Donde esta la mosca!(1-10)")
            posicion = readln().toInt() - 1
        } while (posicion>tamaño || posicion<0)
        if (mosca[posicion] == 1) {
            ganar = true
            intentos++
            println("La mataste en $intentos intentos")
        } else if ((posicion == tamaño) && (mosca[posicion - 1] == 1)) {
            mosca = randomizarMosca(mosca)
            println("Has estado cerca!")
            intentos++
        } else if ((posicion == 0) &&(mosca[posicion + 1] == 1)) {

            mosca = randomizarMosca(mosca)
            println("Has estado cerca!")
            intentos++

        } else if ((posicion!=0 && posicion!=tamaño) && (mosca[posicion - 1] == 1 || mosca[posicion + 1] == 1)) {
            mosca = randomizarMosca(mosca)
            println("Has estado cerca!")
            intentos++
        } else {
            println("No esta ahi!")
            intentos++
        }
    }
}

fun randomizarMosca(array: IntArray):IntArray {
    var array2 = IntArray(array.size) { 0 }
    array2[Random.nextInt(0, array.size)] = 1
    return array2
}