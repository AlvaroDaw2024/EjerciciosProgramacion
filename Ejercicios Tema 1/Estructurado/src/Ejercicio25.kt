/*
Calcula la media para una cantidad indefinida de números.
 El programa parará de pedir números cuando se le introduzca un número negativo,
 en ese momento nos dará la media de los números introducidos hasta ese momento
  y la cantidad de los mismos (sin incluir al negativo que usamos para acabar).
 */
fun main () {
    var cont = 0
    var num = 0
    var suma = 0
    println("Este programa calcula la media para una cantidad indefinida de números has que insertes un negativo")
    do {
        println("Escribe")
        num = readln().toInt()
        if (num >= 0) {
            suma = suma + num
            cont++
        }
    } while (num >= 0)
    println("Has introducido $cont numeros y la media de ellos es ${suma/cont}")
}