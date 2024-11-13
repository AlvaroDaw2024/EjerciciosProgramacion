/*
Escribe un programa modular que pida
 diez valores reales y los almacene en un vector.
  Recórrelo luego para averiguar la media de dichos números.
 */
fun main () {
var array=almacenar()
    println("Tenemos estos numeros:")
    for (i in array.indices) {
        println(array[i])
    }
    println("Y la media es ${media(array)}")
}

fun pedirNumero ():Int{
    println("Dime un numero")
    return readln().toInt()
}

fun almacenar():Array<Int>{
    var array:Array<Int> = Array(10){0}
    for (i in array.indices) {
        array[i]=pedirNumero()
    }
    return array
}

fun media (array:Array<Int>):Int{
    var suma=0
    for (i in array.indices) {
        suma = suma + array[i]
    }
    return (suma / array.size)
}