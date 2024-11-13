/*
Los empleados de una fábrica trabajan por turnos: diurno y nocturno.
Se debe calcular, modularmente, el jornal diario de acuerdo con los siguientes puntos:
- La tarifa por horas diurnas es de 20 €.
- La tarifa por horas nocturnas es de 35 €.
- Caso de ser domingo, la tarifa se incrementará en 10 € más para el turno diurno y 15 € más para el nocturno.
 */

fun main() {
    presentacion("te calcula tu jornal")
    println("Cuantas horas has trabajado?")
    var hora = pedirDatos()
    println("Has trabajado de diurno o nocturno?")
    println("1.-Diurno")
    println("2.-Nocturno")
    var jornada = readln().toInt()
    println("Era domingo? s/n")
    var dom=domingo(readln())
    println(cobro(calculoJornal(hora,jornada,dom)))
}

fun presentacion (mensaje:String) {
    println("Este programa " + mensaje)
}

fun pedirDatos():Int {
    println("Dime un numero de horas")
    return readln().toInt()
}

fun calculoJornal (horas:Int,jornal:Int,domingo:Boolean):Int {
    var diurno = 20
    var nocturno = 35
    var cobro = 0


    if (domingo) {
        diurno = diurno + 10
        nocturno = nocturno + 15
    }
        when (jornal) {
            1 -> {
                cobro = diurno * horas
            }

            2 -> {
                cobro = nocturno * horas
            }


        }
    return cobro
}

fun domingo (respuesta:String):Boolean {
    var reply = true
        when (respuesta) {
            "s", "S", "Si", "si" -> {
                reply = true
            }

            "n", "N", "No", "no" -> {
                reply = false
            }

        }
    return reply
}


fun cobro(dinero:Int) {
    println("Hoy vas a cobrar $dinero")
}