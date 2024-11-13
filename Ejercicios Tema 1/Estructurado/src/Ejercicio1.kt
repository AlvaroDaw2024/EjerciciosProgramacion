fun main() {
    println("Buenos dias, indique aqui la longitud del lado del cuadrado")
    var lado = readln().toInt()
    var superficie:Int=0
    var perimetro:Int=0
    println("En que medida esta? (Cm,M,Km, etc...")
    var medida = readln()
  /* No es necesario en Kotlin, da  error desde el principio
        if (lado != 0..999999){
        println("Escriba un numero")
    } */
    var medidasposibles = listOf("mm", "cm", "M", "km", "CM", "Cm", "KM", "Km")
    if (medida !in medidasposibles) { //Estuve probando con cosas nuevas, claramente no hace falta para este ejercicio
        println("Introduzca una medida de longitud aceptada")
    }
    else {
    perimetro=lado+lado+lado+lado
    superficie=lado*lado
    println("El perimetro es $perimetro$medida y la superficie es $superficie$medida cuadrados")
    }
}