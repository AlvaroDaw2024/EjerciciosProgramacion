fun main () {
    var array: Array<Int> = Array(5) { 0 }
    imprimirArray(array)
    array[4] = 9
    array[0] = 1
    imprimirArray(array)

    var suma = 0
    var media = 0
    println("Dime el tamaño del array que quieres hacer")
    var array2 = pedirTeclado(readln().toInt())
    for (i in array2.indices) {
        println(array2[i])
        suma = suma + array2[i]


    }
    println("La suma de todos los numeros es: $suma")
    media = suma / array2.size
    println("Y la media de estos es: $media")


    var arrayIntercambio1 = pedirTeclado(5)
    var arrayIntercambio2 = pedirTeclado(5)
    imprimirArray(arrayIntercambio1)
    imprimirArray(arrayIntercambio2)
    intercambiar(arrayIntercambio1, arrayIntercambio2)
    imprimirArray(arrayIntercambio1)
    imprimirArray(arrayIntercambio2)

}

fun pedirTeclado (tamaño:Int):Array<Int> {
    var cont = 0
    var array: Array<Int> = Array(tamaño) { 0 }
    do {
        println()
        println("Dime un numero")
        array[cont] = readln().toInt()
        cont++
    } while (cont < array.size)
    return array
}




fun imprimirArray (array:Array<Int>) {
    var cont = 0
    println()
    while (cont < array.size) {
        print("${array[cont]}, ")
        cont++
    }
}

fun intercambiar (array1:Array<Int>, array2:Array<Int>) {
    var cont = 0
    var valorAuxiliar = 0
    while (cont < array1.size) {
        valorAuxiliar = array1[cont]
        array1[cont] = array2[cont]
        array2[cont] = valorAuxiliar
        cont++
    }
}