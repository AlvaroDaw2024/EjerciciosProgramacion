fun main() {
    var array = IntArray(7) { 0 }

    escribirVector(rellenarConSuma(array, pedirNumero2()))
    escribirVector(rellenarConIndice(array,pedirNumero2()))
}

fun pedirNumero2(): Int {
    return readln().toInt()
}

fun rellenarConSuma(array: IntArray, numero: Int): IntArray {
    var aux = numero - 1
    for (i in array.indices) {
        array[i] = aux + 1
        aux++
    }
    return array
}

fun escribirVector(array: IntArray) {
    for (i in array.indices) {
        println(array[i])
    }
}

fun rellenarConIndice(array: IntArray,numero: Int):IntArray{
    var aux = numero
    var anterior = 0
    for (i in array.indices) {
        array[i] = aux
        array[i] = array[i]+i
        anterior=array[i]
        aux=anterior
    }
    return array
}