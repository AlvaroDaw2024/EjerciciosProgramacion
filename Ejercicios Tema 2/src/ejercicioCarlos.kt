//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    do {
        var palabra1 = ""
        do {

            println("Introduce la palabra que hay que adivinar")
            palabra1 = readln()

        } while (palabra1.length != 5)

        var intentos = 0

        do {
            var palabra2 = ""
            var suma = ""
            do {

                suma = "-----"
                println("Introduce una palabra para adivinarla de máximo 5 letras")
                palabra2 = readln()

            } while (palabra2.length != 5)
            var cont = 0

            while (cont < palabra2.length) {

                if (palabra1.indexOf(palabra2.get(cont)) == -1) {

                    suma = suma.substring(0, cont) + '-' + suma.substring(cont + 1)


                } else if ((palabra1.indexOf(palabra2.get(cont)) != -1 && palabra1.get(cont) == palabra2.get(cont))) {

                    suma = suma.substring(0, cont) + palabra2.get(cont) + suma.substring(cont + 1)


                } else if ((palabra1.indexOf(palabra2.get(cont)) != -1 && palabra1.get(cont) != palabra2.get(cont))) {

                    suma = suma.substring(0, cont) + '*' + suma.substring(cont + 1)

                }
                cont++
            }
            println("$suma")
            intentos++
        } while (palabra2 != palabra1)

        println("La palabra era $palabra1 y has necesitado $intentos intentos")
        println(
            "¿Quieres volver a jugar?\n" +
                    "1. Si\n" +
                    "2. No"
        )
        var opcion = readln().toInt()
    } while (opcion != 2)

    println("Muchas gracias por participar")

}