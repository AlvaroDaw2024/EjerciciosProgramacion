fun main() {
    println(presentacion("te dice si un año es bisiesto o no"))
    if (añoBisiesto(pedirDato())==0) {
        println("Es un año bisiesto")
    }
    else {
        println("No es bisiesto")
    }
}

fun presentacion (mensaje:String) {
    print("Este programa " + mensaje)
}

fun pedirDato ():Int {
    return readln().toInt()
}

fun añoBisiesto (año:Int):Int {
    return año%4
}