//Diseña un algoritmo que determine si tres números que pedimos por teclado están ordenados de
// menor a mayor (NO consiste en ordenar, solo indicar si están ordenados o no).
fun main () {
    println("Este programa te indica si los numeros que has indicado estan ordenados o no")
    println("Escribe el primer numero")
    var n1 = readln().toInt()
    println("Escribe el segundo numero")
    var n2 = readln().toInt()
    println("Escribe el tercer numero")
    var n3 = readln().toInt()

    if ((n1<n2) && (n2<n3)) {
        println("Los numeros estan ordenados")
    }
    else {
        println("Los numeros no estan ordenados")
    }

}
