/*
Leídos dos números por teclado, restar al mayor el menor.
 Por ejemplo, si A=9 y B=3 entonces se debe mostrar: “El primero es mayor y la resta es 6”.
 */
fun main () {
    println("Dime dos numeros")
    var resta = 0
    var n1 = readln().toInt()
    println("El segundo")
    var n2 = readln().toInt()
    if (n1==n2) {
        println("Los numeros son iguales")
    }
    else if (n1<n2) {
        resta = n2-n1
        println("El segundo numero es mayor y su resta es $resta")
    }
    else if (n1>n2) {
        resta = n1-n2
        println("El primer numero es mayor y su resta es $resta")
    }
}