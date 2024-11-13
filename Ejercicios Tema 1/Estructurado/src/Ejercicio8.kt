fun main () {
    println("Indica el numero del que quieres saber si tiene decimal")
    var num = readln() ?: ""

    if (num.contains('.') || (num.contains(','))) {
        println("$num tiene decimales")
    }
    else {
        println("$num no tiene decimales")
    }
}