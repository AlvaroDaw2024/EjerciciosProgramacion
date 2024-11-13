fun main() {
    presentacion("te dice si los numeros que metes por teclado estan ordenados")
    if (!numeroMayor(pedirDatos(),pedirDatos(),pedirDatos())) {
        println("No estan ordenados")
    }
}

fun presentacion (mensaje:String) {
    print("Este programa " + mensaje)
}

fun pedirDatos():Int {
    println("Dime un numero")
    return readln().toInt()
}

fun numeroMayor(num:Int, num2:Int, num3:Int):Boolean {
   return (num<num2 && num2<num3)
}
