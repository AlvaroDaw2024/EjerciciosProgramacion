fun main() {
    println("Buenos dias, indique aqui la longitud de la base del rectangulo")
    var base = readln().toInt()
    println("Indique aqui la longitud de la altura")
    var altura = readln().toInt()
    var superficie:Int=0
    var perimetro:Int=0
    println("En que medida esta? (cm,m,km, etc...")
    var medida = readln()

    var medidasposibles = listOf("mm", "cm", "m", "km")
    if (medida !in medidasposibles) { //Estuve probando con cosas nuevas, claramente no hace falta para este ejercicio
        println("Introduzca una medida de longitud aceptada")
    }

    else if (base <= altura) {
        println("La base no puede ser mas pequeña que la altura")
    }
    else {
        perimetro=(base*2)+(altura*2)
        superficie=base*altura
        println("El perimetro es $perimetro$medida y la superficie es $superficie$medida cuadrados")
    }
}