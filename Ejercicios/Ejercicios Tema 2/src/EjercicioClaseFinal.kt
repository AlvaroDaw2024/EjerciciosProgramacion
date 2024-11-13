fun main() {
    var frase= readln()

    var contadores = IntArray(10) {-1}
    var encontrar = false
    var contador = 0
    var cont = 0
    for (i in 0..frase.length-1) {
        encontrar=false
        if (frase[i] == 'e') {
            encontrar=true
        }
        if (encontrar) {
            contadores[cont]=contador
            cont++
        }
        contador++
    }
    for (i in contadores.indices) {
        if (contadores[i] != -1) {
            println("Hay una e en la posicion ${contadores[i]}")
            println(frase[contadores[i]])
        }
    }
}