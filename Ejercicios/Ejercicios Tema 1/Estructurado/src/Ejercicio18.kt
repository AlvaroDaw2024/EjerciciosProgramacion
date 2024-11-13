/*
Dada una hora por teclado (horas, minutos y segundos)
 realiza un algoritmo que muestre la hora después de incrementarle un segundo.

 */

fun main () {
    println("Este programa le muestra la hora escrita despues de incrementarle un segundo")
    println("Indique la hora")
    var hour = readln().toInt()
    println("Indique los minutos")
    var min = readln().toInt()
    println("Indique los segundos")
    var sec = readln().toInt()
    println("Son las $hour:$min:$sec")
        sec++

        if (sec >= 60) {
            sec = sec - 60
            min++
        }

        if (min >= 60) {
            min = min - 60
            hour++
        }

        if (hour >= 24) {
            println("Hemos pasado de dia!")
            hour = hour - 24
        }

        println("Y ahora son las $hour:$min:$sec")

}
