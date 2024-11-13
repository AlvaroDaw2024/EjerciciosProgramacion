/*
Determinar el precio de un billete de tren, conociendo la distancia a recorrer
 y sabiendo que si el número de días de estancia es superior a 7 y la distancia
  superior a 800 km el billete tiene una reducción del 30%. El precio por km es de 2,5 €.

 */

fun main () {
    var precio = 0.0
    var PKM:Double = 2.5
    println("¿Cuantos dias se va a quedar?")
    var dias = readln().toInt()
    println("¿Que distancia recorre su tren?")
    var dist = readln().toDouble()

    if ((dias > 7) && (dist > 800)){
        precio = dist * PKM
        precio = precio - (precio * 0.30)
    }
    else {
        precio = dist * PKM
    }
    println("El precio de su billete es $precio€")
}