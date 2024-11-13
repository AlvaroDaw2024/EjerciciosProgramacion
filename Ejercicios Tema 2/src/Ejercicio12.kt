/*
Realiza el juego del ahorcado. Se debe pedir una palabra a un usuario.
 Posteriormente se borra y se preguntan letras al segundo usuario hasta que este decida resolver.
  Se darán 7 intentos. El ahorcado de toa la vida, vamos.
 */

fun main() {
    val BARRA = 92
    var ganar = false
    var encontrar = false
    var contador = 0
    var letrasdichas = ""
    println("El juego del ahorcado")
    var palabra = pedirDatosString("Dime la palabra con la que vamos a jugar").uppercase()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    var palabraguion = reemplazarConGuion(palabra) //en desuso actual
   // var stringBuilder = StringBuilder(palabraguion)
    var palabrafinal=""
    var palabrahecha=reemplazarConGuion(palabra)
    do {


        println("Dime una letra")
        var letra = readln().first().uppercaseChar()

        encontrar = false
        //palabraguion = comprobar(palabra, letra, palabraguion) //Aqui va con la funcion

        for (i in 0..palabra.length-1){
            if (palabrahecha[i]!='_') { //para que no escriba si ya habia una letra
                palabrafinal=palabrafinal+palabrahecha[i]
            }
            else if (palabra[i]==letra) { //para que escriba si la letra esta en la palabra
                palabrafinal=palabrafinal+letra
                encontrar=true
            }
            else { // para que ponga guion bajo cuando toque
                palabrafinal=palabrafinal+"_"
            }
        }
        palabrahecha=palabrafinal //para ir guardando la palabra anterior y compararla en su momento
        /*
        for (i in 0..palabra.length - 1) {
            if (letra == palabra.get(i)) {
                /* Lo he intentado asi por mi cuenta pero no consigo que funcione, el gpt me da una funcion del stringbuilder que va genial
                var reemplazo = palabraguion.indexOf(palabraguion[i])
                palabraguion=palabraguion.replace(palabraguion[i],letra)
                println(palabraguion)

                stringBuilder.setCharAt(i, letra)
                encontrar = true
                */
            }
        }
/*
        if (encontrar) {
            palabraguion = stringBuilder.toString()
            if (letra !in letrasdichas) {
                letrasdichas = letrasdichas + letra + ", "
            }
        }
        else {

            println("Fallaste!")
            if (letra !in letrasdichas) {
                contador++
                letrasdichas = letrasdichas + letra + ", "
            }
        }



    */
        /*
        for (i in 0..palabra.length - 1) {
            if (palabraguion[i] != '_')
                palabraguion=palabraguion+palabraguion[i]
                if (letra == palabra[i]) {
                    palabraguion = palabraguion + letra
                    encontrar = true
                } else {
                    palabraguion = palabraguion + "_"
                }
        }

         */

         */
        if (letra !in letrasdichas) { // para que vaya guardando las letras que hemos ido diciendo, completamente opcional
            letrasdichas = letrasdichas + letra + ", "
            if (!encontrar) { //esto es que si la letra no esta en las letras que hemos dicho y ademas encontrar es falso sume al contador
                contador++
                println("Te quedan ${7-contador} intentos")
            }
        }
        when (contador) { //una locura mia pero bueno
            1 -> {
                println()
                println("---------")
                println("|       |")
                println("|")
                println("|")
                println("/${BARRA.toChar()}")
            }

            2 -> {
                println()
                println("---------")
                println("|       |")
                println("|       O")
                println("|")
                println("/${BARRA.toChar()}")
            }

            3 -> {
                println()
                println("---------")
                println("|       |")
                println("|     --O")
                println("|")
                println("/${BARRA.toChar()} ")
            }

            4 -> {
                println()
                println("---------")
                println("|       |")
                println("|     --O--")
                println("|")
                println("/${BARRA.toChar()} ")
            }

            5 -> {
                println()
                println("---------")
                println("|       |")
                println("|     --O--")
                println("|       |")
                println("/ ${BARRA.toChar()} ")
            }

            6 -> {
                println("---------")
                println("|       |")
                println("|     --O--")
                println("|       |")
                println("/${BARRA.toChar()}     /")
            }

            7 -> {
                println("---------")
                println("|       |")
                println("|     --O--")
                println("|       |")
                println("/${BARRA.toChar()}     / ${BARRA.toChar()}")
                println("Perdiste!")

            }
        }
        println(palabrafinal)
        println("Has dicho: $letrasdichas")
        if (palabrafinal == palabra) { //el comprobante de si hemos ganado
            ganar = true
            println("Enhorabuena! Ganaste")
        }
        palabrafinal=""//hay que resetear la palabra cada vez porque si no se suma todo el rato, o por lo menos no encontre una manera mejor
    } while (contador < 7 && !ganar)
}


fun reemplazarConGuion(palabra:String):String {
    var guion = ""
    for (i in 0..palabra.length - 1) { //He visto que se puede hacer con un .repeat pero juraria que no lo hemos visto
        guion = guion + '_'
    }
    return guion
}

fun comprobar (palabra: String, letra:Char,palabrahecha:String):String{
    var palabrafinal=""
    for (i in 0..palabra.length-1){
        if (palabrahecha[i]!='_') {
            palabrafinal=palabrafinal+palabrahecha[i]
        }
        else if (palabra[i]==letra) {
            palabrafinal=palabrafinal+letra

        }
        else {
            palabrafinal=palabrafinal+"_"
        }
    }
    return palabrafinal
}


