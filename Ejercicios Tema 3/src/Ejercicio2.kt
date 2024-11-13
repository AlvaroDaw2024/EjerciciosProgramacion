fun main () {
    /*
    var pares: Array<Int> = Array(10) { 0 }
    var impares: Array<Int> = Array(10) { 0 }
    var j = 0
    var k = 0
    var i = 0
    do {
        if (i % 2 == 0 && i != 0) {
            pares[j] = i
            j++
        } else if (i % 2 != 0) {
            impares[k] = i
            k++
        }
        i++
    } while (pares[9] == 0 || impares[9] == 0)
    for (i in pares.indices) {
        println(impares[i])
        println(pares[i])
    }

     */


    var arraypar=esPar(0,20,10)
    var arrayimpar=esImpar(0,20,10)
    for (i in arraypar.indices) {
        println(arraypar[i])
    }
    for (i in arrayimpar.indices) {
        println(arrayimpar[i])
    }
}

fun esPar(numerodesde:Int, numerohasta:Int, numeroarray:Int):Array<Int> {
    var par: Array<Int> = Array(numeroarray) { 0 }
    var i = 0
    var contador = numerodesde
    do {
        if (contador % 2 == 0 && contador != 0) {
            par[i] = contador
            i++
        }
        contador++
    }while ((par[numeroarray - 1] == 0) && contador<=numerohasta)
    return par
}
fun esImpar(numerodesde:Int, numerohasta:Int, numeroarray:Int):Array<Int> {
    var impar: Array<Int> = Array(numeroarray) { 0 }
    var i = 0
    var contador = numerodesde
    do {
        if (contador % 2 != 0) {
            impar[i] = contador
            i++
        }
        contador++
    }while ((impar[numeroarray - 1] == 0) && contador<=numerohasta)
    return impar
}