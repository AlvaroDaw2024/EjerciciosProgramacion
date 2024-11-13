fun main() {
    escribir()
    escribir2("Hola crack")
    sumar(10,23)
    var h = 12
    var g = 123
    var suma = sumar(124,21)
    println("${sumar(10,23)}")
    sumar(sumar(1,7), sumar(3,9))
    if (sumar(8,9)>25) {

    }
    g = sumar(h,g)
    println(g)
}

fun escribir() {
    println("Hola, soy la funcion escribir")
    escribir2("ereh malvado")
}

fun escribir2(texto:String) {
    println("Tengo este texto: $texto")
}

fun sumar (x:Int , y:Int):Int{
    return (x+y)
}