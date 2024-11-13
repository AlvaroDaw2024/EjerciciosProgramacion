/*
Determinar si un número leído por teclado es positivo o negativo mediante un
programa modular.
 */
fun main() {

    presentacion(" determina si un numero es positivo o negativo")
    var num = pedirDato("Escribe aqui el numero")
    comparador(num, "El numero es: ")
}

fun presentacion(mensaje: String) {
    println("Este programa" + mensaje)
}

fun pedirDato(mensaje: String): Int {
    println(mensaje)
    var dato = readln().toInt()
    return dato
}


fun comparador(n: Int, mensaje: String) {
    var comp = ""
    if (n > 0) {
        comp = "Positivo"
    } else if (n < 0) {
        comp = "Negativo"
    } else {
        comp = "Neutro"
    }
    println(mensaje + comp)
}