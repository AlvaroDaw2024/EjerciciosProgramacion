import kotlin.random.Random

fun main() {
    var matriz = Array(5) {
        IntArray(5) { 1;2;3;5;6 }
        IntArray(5) { 1;2;3;5;6 }
        IntArray(5) { 1;2;3;5;6 }
        IntArray(5) { 1;2;3;5;6 }
        IntArray(5) { 1;2;3;5;6 }
    }
    var matriz2 = Array(5) { IntArray(5) { 0 } }
    matriz2 = rellenarMatriz(matriz2)
    printearMatriz2(matriz2)
    adyacente(matriz2, Random.nextInt(0,matriz2.size), Random.nextInt(0,matriz2.size))

}

fun rellenarMatriz(matriz: Array<IntArray>): Array<IntArray> {
    for (i in matriz.indices)
        for (j in matriz.indices) {
            matriz[i][j] = Random.nextInt(1, 10)
        }
    return matriz
}

fun printearMatriz2(m: Array<IntArray>) {
    for (i in m.indices) {
        println()
        for (j in m.indices) {
            print("${m[i][j]} ")
        }
    }
}

fun adyacente(matriz: Array<IntArray>, x: Int, y: Int) {
    var i = -1
    var j = 0
    var xCasilla = 0
    var yCasilla = 0
    while (i <= 1) {

        j = -1
        println()
        while (j <= 1) {
            xCasilla = x + i
            yCasilla = y + j
            if ((Math.abs(x) + Math.abs(y)) == 2) { //1 son los lados y 2 son los vertices
                if ((xCasilla >= 0 && xCasilla < matriz.size) && (yCasilla >= 0 && yCasilla < matriz.size)) { //IMPORTANTISIMO
                    if (i == 0 && j == 0) {
                        print("  ")
                    } else {
                        print("${matriz[xCasilla][yCasilla]} ")
                    }
                }
                j++
            }
            i++
        }
    }
}