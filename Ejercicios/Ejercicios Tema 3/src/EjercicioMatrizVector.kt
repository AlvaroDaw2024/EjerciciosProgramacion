import kotlin.random.Random

fun main() {
    //vector de 5 posiciones y lo rellenemos con numeros aleatorios
    //matriz de 3 x 3 rellenarlo con aleatorios
    // var matriz = Array(3) {IntArray(3)}
    /*
    for (i in matriz.indices) {
        for (j in matriz.indices) {
            matriz[i][j]=Random.nextInt(1,101)
        }
    }

     */

    /*
    for (i in matriz.indices) {
        for (j in matriz.indices) {
            println(matriz[i][j])
        }
    }

     */
    /*
        var i=0
        while (i<matriz.size) {
            var j=0
            while (j<matriz.size) {
                matriz[i][j]=Random.nextInt(1,101)
                j++
            }
            i++
        }
        i=0
        while (i<matriz.size) {
            var j=0
            while (j<matriz.size) {
                print(matriz[i][j])
                j++
            }
            i++
        }

     */

    var matriz = rellenarMatriz(3)
    printearMatriz(matriz)
    var sumaColumna = sumaColumnasoFilas(matriz,true)
    var sumaFila = sumaColumnasoFilas(matriz,false)
    printearVector(sumaColumna,"Columna")
    printearVector(sumaFila,"Fila")
}

fun rellenarMatriz(tamaño: Int): Array<IntArray> {
    var matriz = Array(tamaño) { IntArray(tamaño) }
    for (i in matriz.indices) {
        for (j in matriz.indices) {
            matriz[i][j] = Random.nextInt(1, 101)
        }
    }
    return matriz
}

fun printearMatriz(array: Array<IntArray>) {
    for (i in array.indices) {
        for (j in array.indices) {
            println("En la fila ${i + 1} y la columna ${j + 1} esta el numero: ${array[i][j]}")
        }
    }
}

fun sumaColumnasoFilas(array: Array<IntArray>,columna:Boolean): Array<Int> {
    var arraysuma: Array<Int> = Array(array.size) { 0 }
    var suma = 0
    for (i in array.indices) {
        suma = 0
        for (j in array.indices) {
            if (columna) {
                suma = suma + array[j][i]
            } else {
                suma = suma + array[i][j]
            }
            arraysuma[i] = suma
        }
    }

    return arraysuma
}
fun sumaFilas(array: Array<IntArray>): Array<Int> {
    var arraysuma: Array<Int> = Array(array.size) {0}
    var suma = 0
    for (i in array.indices) {
        suma = 0
        for (j in array.indices) {
            suma = suma + array[i][j]
        }
        arraysuma[i] = suma
    }
    return arraysuma
}

fun printearVector(array:Array<Int>,mensaje:String){
    for (i in array.indices) {
        println(mensaje + ' ' + "${i+1}")
        println(array[i])
    }
    println()
}