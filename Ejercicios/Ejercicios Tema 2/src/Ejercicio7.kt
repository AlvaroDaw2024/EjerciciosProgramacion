fun main () {
    var cadena =""
    println("Pedir un número telefónico en formato de cadena y luego lo convierta de la siguiente manera:")
    println("Número Telefónico: 34555332211\n" +
            "Nueva Cadena: (+34)-555-332211")
    do {
        cadena = pedirDatosString("Dime tu numero de telefono")

    }while (cadena.length != 11)
    println(cadenaToNumeroTel(cadena))
}

fun cadenaToNumeroTel (numero:String):String {
    var parentesis=")"
    var sumaparentesis="(+"
    var pais= numero.substring(0,2)
    var tresnum=numero.substring(2,5)
    var resto=numero.substring(5)
    return sumaparentesis + pais + parentesis + "-" + tresnum + "-" + resto
}