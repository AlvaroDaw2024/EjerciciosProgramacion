fun main () {
    var base:Int = pedirDatos("Dame la base")
    var altura:Int = pedirDatos("Dame la altura")

    println("La base es $base y la altura $altura es")
}

fun pedirDatos(mensaje:String):Int {
    var dato = 0
    println(mensaje)
    dato = readln().toInt()
    return dato
}

fun area() {

}

fun perimetro() {

}