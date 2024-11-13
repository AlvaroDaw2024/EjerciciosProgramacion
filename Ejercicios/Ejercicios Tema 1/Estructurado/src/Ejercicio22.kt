/*
Suma todos los números impares que hay entre 1 y 20 mostrando el resultado al final.
 Generaliza luego este ejercicio para dos números cualquiera pedidos por teclado, deberá ir del menor al mayor.
 */
/*
fun main () {
    println("Este programa suma todos los numeros impares que hay entre el 1 y el 20")
    var suma = 0
    var cont = 0
    do {
        cont++
        if (cont % 2 != 0) {
            suma = suma + cont
            println("Hay un impar y es $cont")
            println(suma)

        }
    } while (cont < 20)
    println("La suma de los impares desde el 1 al 20 es $suma")
}
*/

fun main () {
    println("Este programa suma todos los numeros impares que hay entre los numeros que pongas por teclado")

    var num1 = 0
    var num2 = 0
    do {
        println("Indica el primer numero")
        num1 = readln().toInt()
        println("Indica el segundo numero")
        num2 = readln().toInt()
    } while (num2 < num1)
    var min=num1
    var suma = 0
    do {
        if (min % 2 != 0) {
            suma = suma + min
            println("$suma")
        }
        min++
    } while (min < num2)
    println("La suma de los impares desde el $num1 al $num2 es $suma")
}

