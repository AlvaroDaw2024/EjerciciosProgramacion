/*
Escribe todos los números pares entre 1 y 20.
 */
fun main () {
    var num = 0
    println("Este programa te saca los numeros pares entre 1 y 20")
    do {
        num ++
       if (num % 2 == 0) {
           println("$num")
       }
    } while (num < 20)
}