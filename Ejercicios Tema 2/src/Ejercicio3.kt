/*
Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.
Ejemplo:
Entrada: cad = "Hola DAW1"
Salida: La cantidad de vocales es 3
 */
/*
fun main () {
    var cont=0
    println(intro("te dice cuantas vocales tiene la cadena que has introducido"))
    var frase = readln()
    for (i in 0..frase.length-1) {
        var num = frase.get(i)
       when (num) {
           'a', 'e', 'i' , 'o', 'u' -> {
               cont++
           }
       }

    }
    println("La cantidad de vocales es $cont")
}
*/
fun main () {
    var cont=0
    println(intro("te dice cuantas vocales tiene la cadena que has introducido"))
    var frase = readln()
    for (i in 0..frase.length-1) {
        var num = frase.get(i).code
        when (num) {
            97 , 101 , 105 , 111 , 117 , 65 , 69 , 73 , 79 , 85 -> {
                cont++
            }
        }

    }
    println("La cantidad de vocales es $cont")
}