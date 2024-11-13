//tres numeros por teclado y evaluamos si la suma de esos tres numeros es mas que 11 pero menos que 50 y son modulares a 3 se imprime por teclado, si no error,

fun main () {
            println("Dime tres numeros cualquiera")
            var numero1 = readln().toInt()
            println("El siguiente")
            var numero2 = readln().toInt()
            println("El ultimo")
            var numero3 = readln().toInt()
            var resul = numero3+numero2+numero1
    if ((resul > 11) && (resul < 50) && (resul%3 == 0)) {
        println("$resul es correcto")
    }
    else {
        println("Da error, pon otros numeros que estamos a martes")
    }
}