fun main () {
    var lado = pedirDatos()
    val lados = 4
    //println("Dime que si quieres hacer el area o el perimetro")
    //operacion(readln(), lado)
    operacionMarci(lado , lados , "El perimetro es")
    operacionMarci(lado , lado , "El area es:" )
}

fun pedirDatos():Int {
    var dato = 0
    println("Dame el lado del cuadrado")
    dato = readln().toInt()
    return dato
}
/*
fun pedirDatos1 ():Int {
    println("Dame el lado del cuadrado")
    return readln().toInt()
}

fun area (l:Int) {
    println("El area es ${l*l}")
}

fun perimetro (l:Int) {
    println("El perimetro es ${l*4}")
}

*/
fun operacion (opcion:String, l:Int) {
    when (opcion) {
        "1", "area" -> println("El area es ${l * l}")
        "2", "perimetro" -> println("El perimetro es ${l * 4}")
    }
}

fun operacionMarci (l:Int , l2:Int , mensaje:String) {
    var calculo = l * l2
    println(mensaje + " " + calculo)
}