fun main() {
    var x1:Int = 0
    var x2:Int = 0
    var x3:Int = 0
/*
    println("Este programa te hace una media de tres numeros")
    println("Escribe el primer numero")
    x1 = readln().toInt()
    println("El siguiente")
    x2 = readln().toInt()
    println("El ultimo")
    x3 = readln().toInt()

    var resul = (x1 + x2 + x3) / 3
*/
    //Vamos a poner un bucle
    //Una variable inicial con valor

    println("De cuantos numeros quieres la media")
    var cantidad = readln().toInt()
    var suma = 0
    var resul = 0
    var contador = 0
    while(contador < cantidad) { //en la condicion evaluar la variable
        println("Dame un numero:")
        var n1 = readln().toInt()
        suma = suma + n1
        contador ++
    }
    resul = suma / cantidad
    println("La media de los $cantidad numeros que nos has proporcionado es $resul")
}