/*
Un array de 5 elementos inicializados a 0 y guardamos 5 numeros y luego print
 */
fun main() {
    var numeros: Array<Int> = Array(5) { 0 }
    /*
    for (i in numeros.indices) {
        numeros[i]= readln().toInt()
    }
    for (i in numeros.indices) {
        println(numeros[i])
    }

     */
    var i = 0
    while (i < numeros.size) {
        println("Dime un numero")
        numeros[i] = readln().toInt()
        i++
    }
    var j = 0
    while (j < numeros.size) {
        println(numeros[j])
        j++
    }
}