fun main() {
    var texto = pedirDatosString("Dime el mensaje que deseas codificar")
    println(codificador(texto))
}

fun codificador(texto: String):String {
    var textocodificado = ""
    var textomayus = texto.uppercase()
    for (i in 0..texto.length - 1) {
        if (textomayus.get(i) == 'Z') {
            textocodificado = textocodificado + ('A'.code).toChar()
        }
        else if (textomayus.get(i) == '9') {
            textocodificado = textocodificado + ('0'.code).toChar()
        }
        else if (textomayus.get(i) == ' ') {
            textocodificado = textocodificado + ' '
        }
        else if (textomayus.get(i) in 'A'..'Y' || textomayus.get(i) in '0'..'8') {
            textocodificado = textocodificado + (textomayus.get(i).code+1).toChar()
        }

        else {
            textocodificado = textocodificado + textomayus.get(i)
        }

    }
    return textocodificado
}