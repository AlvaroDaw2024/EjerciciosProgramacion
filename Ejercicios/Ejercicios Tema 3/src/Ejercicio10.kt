import kotlin.random.Random

fun main () {
    /*
    Loteria primitiva sin que se repita ningun numero
     */
    var numerosLoteria = IntArray(6) { 0 }
    var numero = 0
    var cont = 0
    var repetir = false
    var contador = 0
    do {
        do {
            numero = Random.nextInt(1, 7)
            if (numerosLoteria[contador] == numero) {
                repetir = true
            } else {
                repetir = false
            }
            contador++
        } while (repetir && contador!=6)
        numerosLoteria[cont] = numero
        cont++
        contador = 0
    } while (cont < numerosLoteria.size)
    for (i in numerosLoteria.indices) {
        println(numerosLoteria[i])
    }
}