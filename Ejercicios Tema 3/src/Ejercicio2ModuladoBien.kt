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


    var arraypar=esParoImpar(0,20,100, true)
    var arrayimpar=esParoImpar(0,20,100, false)
    for (i in arraypar.indices) {
        println(arraypar[i])
    }
    for (i in arrayimpar.indices) {
        println(arrayimpar[i])
    }
}

fun esParoImpar(numerodesde:Int, numerohasta:Int, tamañoarray:Int, parboolean:Boolean):Array<Int> {
    var array: Array<Int> = Array(tamañoarray) { 0 }
    var i = 0
    var contador = numerodesde
    if (parboolean) {
        do {
            if (contador % 2 == 0 && contador != 0) {
                array[i] = contador
                i++
            }
            contador++
        } while ((array[tamañoarray - 1] == 0) || contador <= numerohasta)
    }
    else {
        do {
            if (contador % 2 != 0) {
                array[i] = contador
                i++
            }
            contador++
        }while ((array[tamañoarray - 1] == 0) || contador<=numerohasta)
    }
    return array
}
/*
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

 */