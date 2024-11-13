//3 numeros en pantalla, cual es el mayor
fun main() {
    println("Escribe tres numeros y este programa te indica cual es el mayor")
    println("Escribe el primer numero")
    var n1 = readln().toInt()
    println("Escribe el segundo numero")
    var n2 = readln().toInt()
    println("Escribe el tercer numero")
    var n3 = readln().toInt()

    if ((n1 > n2) && (n1 > n3)) {
        println("$n1 es el mayor")
    }
    else if ((n2 > n1) && (n2 > n3)) {
        println("$n2 es el mayor")
    }
    else if ((n3 > n1) && (n3 > n2)) {
        println("$n3 es el mayor")
    }
    else {
        println("Los numeros son iguales")
    }
}