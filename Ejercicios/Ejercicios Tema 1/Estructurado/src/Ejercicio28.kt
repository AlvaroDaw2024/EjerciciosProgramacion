fun main () {
    var num = 0
    println("Este programa te pide numeros por teclado hasta que metas uno que este entre 1 y 5")
    do {
        println("Escribe un numero")
        num = readln().toInt()
    } while (num !in 1..5)
    println("Bien hecho! Salimos")
}