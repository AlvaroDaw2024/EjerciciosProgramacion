fun main () {
    println("Dime un numero hasta el que quieras contar")
    var num = readln().toInt()
    println("Dime el numero desde el que empezamos")
    var contador = readln().toInt()
    while (contador < num) {
        contador++
        println("$contador")
    }
    println("El contador ha llegado a $num")
}