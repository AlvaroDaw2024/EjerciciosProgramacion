/*
Crea una aplicación que pida un numero por teclado y después comprobaremos
 si el numero introducido es capicúa, es decir, que se lee igual sin importar la dirección.
 Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no es capicúa. Utiliza vectores para resolver el problema.
 */
fun main() {
    var numeroteclado=0
    do {
        numeroteclado = readln().toInt()
    } while (numeroteclado in -999999..999999 && !digitos(numeroteclado))
    var numero=numeroteclado.toString()
    var array1 = IntArray(numero.length)
for (i in array1.indices) {
    array1[i]=numero[i].digitToInt()
}
    var array2=vueltaArray(array1)
    printearArray(array1)
    printearArray(array2)
if (comprobarCapicua(array1,array2)){
    println("$numero es capicua!")
}
    else{
        println("$numero no es capicua...")
    }

}

fun comprobarCapicua(array1: IntArray, array2: IntArray):Boolean{
    var capicua = true
    var contador=0
    do {
        if (array1[contador]!=array2[contador]){
            capicua=false
        }
        contador++
    }while (!capicua && contador<array1.size)


    return capicua
}

fun vueltaArray(array: IntArray):IntArray{
    var contador = 0
    var numero = array.size-1
    var arrayaux=IntArray(array.size)
    do {
        arrayaux[contador] = array[numero]
        contador++
        numero--
    } while (contador < array.size)
    return arrayaux
}

fun printearArray(array: IntArray){
    for (i in array.indices) {
        print("Posicion $i: ")
        println(array[i])
    }
}

fun digitos (numero:Int):Boolean{
    var contador=0
    var digitos=false
    var numeroaux=numero
    do {
        numeroaux=numeroaux/10
        contador++
    } while (numeroaux!=0)
    if (contador>2){
        digitos=true
    }
    return digitos
}