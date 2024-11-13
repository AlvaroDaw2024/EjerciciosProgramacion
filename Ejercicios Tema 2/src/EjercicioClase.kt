fun main() {
    /*
    println("DIme el primer caracter")
    var letra1= readln().first().lowercase()
    println("DIme el segundo caracter")
    var letra2= readln().first().lowercase()
    println("La diferencia entre ellos es ${letra1.compareTo(letra2)}")

     */
    /*
    var frase="Fiesta de los Santos"
    println(frase.substring(7,9))
    println(frase.substring(14,16))
    println(frase.substring(4,8))
    println(frase.length)
    var n1=0
    var n2=0
    do{
        do {
            println("Dime el primer numero")
            n1= readln().toInt()
        } while (n1<0 || n1>frase.length)
        do {
            println("Dime el segundo numero")
            n2= readln().toInt()
        } while (n2<0 || n2>frase.length)

    } while (n1>n2)

    println(frase.substring(n1,n2))

     */
    var frase = "Fiesta de los Santos"
    var n1 = frase.indexOf('e')
    println(frase.indexOf('e'))
    println(frase.indexOf(startIndex = n1,'e'))
}
