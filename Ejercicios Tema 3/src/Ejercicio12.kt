import kotlin.random.Random

/*
Realiza un programa que inicie dos vectores de 3 elementos y los sume en un tercero.
 */
fun main () {
    var array1=IntArray(3)
    var array2=IntArray(3)
    var arraysuma= sumarVectores(vectorAleatorioNegativo(array1),vectorAleatorioNegativo(array2))
    printVector(arraysuma)
}




fun vectorAleatorioNegativo(array: IntArray):IntArray{
    for (i in array.indices) {
        array[i] = Random.nextInt(-100,101)
    }
    return array
}

fun sumarVectores(array1: IntArray,array2: IntArray):IntArray{
    var arraysuma=IntArray(3)
    for (i in array1.indices){
        arraysuma[i]= array1[i]+array2[i]
    }
    return arraysuma
}

fun printVector(array: IntArray){
    for (i in array.indices) {
        println("La suma de la ${i+1}º columna es: ${array[i]}")
    }
}