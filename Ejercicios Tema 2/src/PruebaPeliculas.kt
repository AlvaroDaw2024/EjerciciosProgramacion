import kotlin.random.Random
/*
Un programa que hice para ver pelis con mi novia porque somos incapaces de decidirnos
 */
fun main() {
    var ganar = true
    println("Cuantas peliculas quieres introducir?")
    var cantidad = readln().toInt()
    var peliculas: Array<String> = Array(cantidad) { "" }
    var contadores = IntArray(cantidad) { 0 }
    for (i in peliculas.indices) {
        println("Dime una pelicula")
        peliculas[i] = readln()
    }
    do {
        Thread.sleep(1_000)  // wait for 1 second
        var numrandom = Random.nextInt(0, peliculas.size)
        when (numrandom) {
            0 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            1 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            2 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            3 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            4 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            5 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            6 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            7 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            8 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }

            9 -> {
                println("Ha ganado ${peliculas[numrandom]}")
                contadores[numrandom]++
            }
        }
        if (contadores[numrandom] == 3) {
            println("La pelicula que nos toca ver es: ${peliculas[numrandom]}")
            ganar=false
        }
    } while (ganar)
}
   // println("Ha tocado ${peliculas[Random.nextInt(0,peliculas.size)]}")
