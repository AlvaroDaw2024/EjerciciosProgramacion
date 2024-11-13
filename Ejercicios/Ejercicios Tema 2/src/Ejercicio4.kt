/*Dada una cadena, y un carácter, verificar cuántas veces se repite el carácter en la cadena, por ejemplo:
Entrada: cad = "casa blanca", car = 'a'
Salida: El carácter 'a' se repite 4 veces.
 */
fun main () {
    var cont = 0
    println("dime una frase")
    var frase = readln()
    println("dime la letra")
    var letra = readln().first()
    for (i in 0..frase.length - 1) {
        if (frase.get(i) == letra) {
            cont++
        }
    }
    if (cont == 0) {
        println("El caracter $letra no aparece")
    } else {
        println("El caracter $letra se repite $cont veces")
    }

}