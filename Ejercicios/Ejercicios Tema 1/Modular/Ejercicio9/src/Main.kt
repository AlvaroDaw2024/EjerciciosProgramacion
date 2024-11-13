fun main() {
    presentacion("cuantas cifras tiene tu numero")
    println("Tu numero tiene ${cuantasCifras(pedirDatos())} cifras")
}


fun presentacion (mensaje:String) {
    print("Este programa " + mensaje)
}

fun pedirDatos():String {
    println("Dime un numero")
    return readln()
}

fun cuantasCifras(num:String):Int {
    var cont=0
    if (num.startsWith("-")) {
        cont--
    }
    for (i in 1..num.length) {
        cont++
    }
    return cont
}
