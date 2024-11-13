import kotlin.random.Random

/*
Diseña un programa que genere un vector con números al azar que oscilan entre [-100 y 100].
 Después realiza un módulo que indique cuantos números positivos y cuantos negativos hay.
 */
fun main () {
    var array=arrayAleatorioNegativo(20)
    comprobarNegativo(array)
}

fun arrayAleatorioNegativo(tamaño:Int):Array<Int> {
    var array: Array<Int> = Array(tamaño) { 0 }
    for (i in array.indices) {
        array[i] = Random.nextInt(-100, 101)
    }
    return array
}

fun comprobarNegativo(array: Array<Int>){
    for (i in array.indices) {
        if (array[i] > 0) {
            println("${array[i]} es positivo")
        }
        else{
            println("${array[i]} es negativo")
        }
    }
}