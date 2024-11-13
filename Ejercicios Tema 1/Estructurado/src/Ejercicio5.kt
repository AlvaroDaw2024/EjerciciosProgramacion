fun main() {
    println("Este programa te indica si el numero que introduces es positivo o negativo")
    println("Escribe aqui el numero")
    var num = readln().toInt()

    if (num > 0) {
        println("$num es positivo")
    }

    else if (num < 0) {
        println("$num es negativo")
    }

    else {
        println("El numero es cero")
    }


}