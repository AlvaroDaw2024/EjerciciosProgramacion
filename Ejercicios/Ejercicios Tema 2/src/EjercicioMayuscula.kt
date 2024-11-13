/*
pide por teclado una letra minuscula y sin utilizar el uppercase hay que convertirla en mayuscula
 */

fun main () {
    println("Dime una letra minuscula")
    var intro = readln()
    var letra:Char = intro.get(0)


    //var num = letra.code
    var num = letra.toInt()
    var mayus = num - 32
    println(num)
    println(mayus.toChar())
}