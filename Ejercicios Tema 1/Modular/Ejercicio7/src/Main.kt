fun main() {
    var cont = 0
    do {
        when (pedirDato("Dime que operacion deseas")) {
            1 -> println(CenToFah(pedirGrados()))

            2 -> println(FahToCen(pedirGrados()))

            3 -> cont = -1

            else -> cont++
        }
    } while (cont > 0)
}

fun pedirDato(mensaje: String):Int {
    println(mensaje)
    println("1.Grados Centigrados a Farenheit")
    println("2.Grados Farenheit a Centigrados")
    println("3. Salir")
    return readln().toInt()
}

fun pedirGrados():Double {
    println("Indicame los grados")
    return readln().toDouble()
}

fun FahToCen (num:Double):Double {
    return (num - 32) * 5 / 9
}

fun CenToFah (num:Double):Double {
    return (num * 9 / 5) + 32
}

