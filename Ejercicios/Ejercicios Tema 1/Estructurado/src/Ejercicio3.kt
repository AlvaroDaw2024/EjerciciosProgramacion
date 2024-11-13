import kotlin.math.PI

fun main() {
    println("Indicame el radio del circulo")
    var radio = readln().toInt()
    var area=0
    var circun=0
    println("En que medida esta? (cm,m,km, etc...")
    var medida = readln()

    var medidasposibles = listOf("mm", "cm", "m", "km", "M", )
    if (medida !in medidasposibles) { //Estuve probando con cosas nuevas, claramente no hace falta para este ejercicio
        println("Introduzca una medida de longitud aceptada")
    }
/*Me gustaria introducir aqui codigo para convertir esos cm (o metros, milimetros, etc) en la siguiente
 medida si dan mas de 100 pero no se me ocurre como ahora mismo
*/
    else {
        area = (radio * radio * PI).toInt() //Esto lo he buscado por internet, no paraba de dar error con Double
        circun = (2 * PI * radio).toInt()
        println("El area del circulo es $area$medida y la circunferencia es $circun$medida")
    }
}