/*
º Los empleados de una fábrica trabajan por turnos: diurno y nocturno.
Se debe calcular el jornal diario de acuerdo con los siguientes puntos:
- La tarifa por horas diurnas es de 20 €.
- La tarifa por horas nocturnas es de 35 €.
- Caso de ser domingo, la tarifa se incrementará en 10 € más para el turno diurno y 15 € más para el nocturno.

 */

fun main() {
    val dias = listOf("Lunes" , "Martes" , "Miercoles" , "Jueves" , "Viernes" , "Sabado" , "Domingo", "lunes" , "martes" , "miercoles" , "jueves" , "viernes" , "sabado" , "domingo")
    var paga = 0.0
    var noche = 35.0
    var dia = 20.0
    println("¿Que dia de la semana es?")
    var diasemana = readln()
    if (diasemana !in dias) {
        println("Escribe un dia de la semana correctamente")
    }
    else {
        println("¿Que turno tiene, diurno o nocturno?")
        var turno = readln()
        println("¿Cuantas horas le tocan?")
        var jornal = readln().toInt()


        if ((diasemana == "domingo") || (diasemana == "Domingo")) {
            noche = noche + 15
            dia = dia + 10
            println("Usted cobra mas hoy")
        }
        if (turno == "diurno") {
            paga = jornal * dia
        } else if (turno == "nocturno") {
            paga = jornal * noche
        } else {
            println("No ha introducido bien el turno")
        }
        println("Usted va a cobrar hoy $paga€")
    }
}

