import com.sun.source.tree.VariableTree

/*
Escriba un programa que calcule la frecuencia de aparición de las vocales de un texto proporcionado por el usuario.
 Esta solución se debe presentar en forma de histograma, por ejemplo:
a 15 ***************
e 8 ********
etc…
 */

fun main () {
    val letra:Array<Char> = arrayOf('a' , 'e' , 'i' , 'o' , 'u')
    val contadores = IntArray(5){0}
    var contaA=0
    var contaE=0
    var contaI=0
    var contaO=0
    var contaU=0
    println("Escriba un programa que calcule la frecuencia de aparición de las vocales de un texto proporcionado por el usuario.")
    var texto = pedirDatosString("Escribe la frase")
    for (i in 0..texto.length-1) {
        when (texto.get(i)) {
            'a', 'A' -> {
            contadores[0]++
            }
            'e', 'E'-> {
            contadores[1]++
            }
            'i' , 'I'-> {
            contadores[2]++
            }
            'o' , 'O' -> {
            contadores[3]++
            }
            'u', 'U'-> {
            contadores[4]++
            }
        }
    }
    for (i in contadores.indices) //mejor que ponerlo a mano con in 0..4
   println(infograma(letra[i], contadores[i])) //FUNCIONA!

}

fun infograma (letra:Char, cantidad:Int):String {
    var asteriscos=""
    for (i in 1..cantidad) {
        asteriscos=asteriscos+'*'
    }
    var retornar = "$letra $cantidad $asteriscos"
    return retornar

}