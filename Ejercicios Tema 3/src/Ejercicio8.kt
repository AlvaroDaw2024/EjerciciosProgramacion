/*
Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, guardar los valores de este
array en otro array distinto pero con los valores invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
 */
fun main() {
val array1=IntArray(5){0}
    for (i in array1.indices) {
        array1[i]=i+1
        println(array1[i])
    }
   var array2 = restaArray(array1)
    for (i in array2.indices) {
        println(array1[i])
    }
}

fun restaArray(array: IntArray):IntArray{
var contador=0
    var numero=array.size
    do {
        array[contador]=numero
        contador++
        numero--
    } while (contador<array.size)
    return array
}
