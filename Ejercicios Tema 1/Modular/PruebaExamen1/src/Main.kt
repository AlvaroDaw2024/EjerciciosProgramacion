import kotlin.random.Random

fun main() {
    println("Cuantas veces vamos a mirar")
    var n = readln().toInt()
    var riego = 0
    for (i in 1..n) {
        riego = riego
        var sensorHumedadSuelo = Random.nextInt(1, 4)
        var sensorRadiacion = Random.nextInt(1, 3)
        var sensorHumedadAire = Random.nextInt(1, 3)
        var sensorCrecimiento = Random.nextInt(2, 3)
        when (sensorHumedadSuelo) {
            1 -> println("Humedad del suelo baja \n")
            2 -> println("Humedad del suelo media \n")
            3 -> println("Humedad del suelo alta \n")
        }
        when (sensorHumedadAire) {
            1 -> println("Humedad del aire baja \n")
            2 -> println("Humedad del aire media \n")
        }
        when (sensorRadiacion) {
            1 -> println("Radiacion baja \n")
            2 -> println("Radiacion alta \n")
        }
        when (sensorCrecimiento) {
            1 -> println("Crecimiento insuficiente \n")
            2 -> println("Crecimiento suficiente \n")
        }

        if ((sensorHumedadSuelo == 1 || sensorRadiacion == 1 && sensorHumedadAire == 1) || sensorCrecimiento == 1) {
            println("Tenemos que regar \n")
            riego = 1
        } else if (sensorHumedadSuelo == 1 && sensorRadiacion == 1 && sensorHumedadAire == 2 && sensorCrecimiento == 1) {
            println("Tenemos que regar dos veces \n")
            riego = 1
        } else if ((sensorHumedadSuelo == 2 || sensorRadiacion == 2 || sensorHumedadAire == 2) && sensorCrecimiento == 2) {
            println("No hace falta regar \n")
            riego = 0
        } else if ((sensorHumedadSuelo == 3 || sensorRadiacion == 2) && (sensorHumedadAire == 2 || sensorCrecimiento == 2)) {
            if (riego == 0) {
                println("Se riega \n")
            } else if (riego == 1) {
                println("No se riega \n")
            }
        }
    }
}
