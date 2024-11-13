fun main () {
    var contador = 0
    var num = 0
    do {
        println("Este programa...")
        println("Escribe el numero")
        num = readln().toInt()
    } while ((num < -99999) || (num > 99999))
    do {
        num = num / 10
        contador++
    } while (num != 0)
    println("Tiene $contador cifras")
}