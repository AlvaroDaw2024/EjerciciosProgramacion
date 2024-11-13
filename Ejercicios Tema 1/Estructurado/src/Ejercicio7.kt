fun main () {
    var year:Int

    println("Indica el año que quieres comprobar")
    year = readln().toInt()

    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0)) {
        println("$year es bisiesto")
    }
    else {
        println("$year es bisiesto")
    }
}