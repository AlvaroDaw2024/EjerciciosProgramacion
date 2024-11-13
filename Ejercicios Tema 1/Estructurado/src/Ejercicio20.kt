/*
Dado el nombre (o número) de un mes y el año
(comprobando si es o no bisiesto), deducir el número de días del mes.


//Este programa funciona perfectamente pero quiero agregarle
// un mapOf para que en ver de escribir el numero ponga el mes al que corresponde!
fun main () {

    val dias31 = listOf("1" , "Enero" , "3" , "Marzo" , "5" , "Mayo" , "7" , "Julio" , "8" , "Agosto" , "10" , "Octubre" , "12" , "Diciembre")
    val dias30 = listOf("Abril" , "4" , "6" , "Junio" , "9" , "Septiembre" , "11" , "Noviembre")
    println("Dime el nombre o numero del mes")
    var mes = readln()
    var bisiesto = false
    println("Dime el año")
    var year = readln().toInt()
    if (year % 4 == 0) {
        println("Este año es bisiesto!")
        bisiesto = true
    }
    if (mes in dias31) {
        println("$mes tiene 31 dias!")
    }
    else if (mes in dias30) {
        println("$mes tiene 30 dias!")
    }
    else if ((mes == "2") || (mes == "Febrero")) {
        if (bisiesto == true) {
            println("$mes tiene 29 dias este año!")
        }
        else {
            println("$mes tiene 28 dias este año!")
        }
    }


}
*/
 /*fun main () {
    //val dias31 = listOf("1", "Enero", "3", "Marzo", "5", "Mayo", "7", "Julio", "8", "Agosto", "10", "Octubre", "12", "Diciembre")
    //val dias30 = listOf("Abril", "4", "6", "Junio", "9", "Septiembre", "11", "Noviembre")
    val meses = mapOf(
        "1" to "Enero", "2" to "Febrero", "3" to "Marzo", "4" to "Abril",
        "5" to "Mayo", "6" to "Junio", "7" to "Julio", "8" to "Agosto",
        "9" to "Septiembre", "10" to "Octubre", "11" to "Noviembre", "12" to "Diciembre"
    )
    println("Dime el nombre o numero del mes")
    var mes = readln()
    mes = meses[mes] ?: mes
    var bisiesto = false
    println("Dime el año")
    var year = readln().toInt()
    if (year % 4 == 0) {
        println("Este año es bisiesto!")
        bisiesto = true
    }
    when (mes) {
        "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" -> {
            println("$mes tiene 31 días.")
        }

        "Abril", "Junio", "Septiembre", "Noviembre" -> {
            println("$mes tiene 30 días.")
        }

        "Febrero" -> {
            if (bisiesto == true) {
                println("Febrero tiene 29 días este año.")
            } else {
                println("Febrero tiene 28 días este año.")
            }
        }
    }
}
*/
fun main () {
    println("Dime el nombre o numero del mes")
    var mes = readln().toInt()
    var bisiesto = (mes % 4 == 0 && mes % 100 != 0)
    when (mes) {

    1, 3, 5, 7, 8, 10, 12 -> println("31 dias")
    4, 6, 9, 11 -> println("30 dias")
    2 -> if (bisiesto == true) println("29 dias") else println("28 dias")
    else ->
        println("Mes no valido")

    }
}