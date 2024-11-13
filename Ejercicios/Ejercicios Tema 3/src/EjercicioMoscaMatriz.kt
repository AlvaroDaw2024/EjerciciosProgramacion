import kotlin.random.Random

fun main() {
var matriz=Array(10){IntArray(10){0}}
    
}

fun randomizarMoscaMatriz(matriz:Array<IntArray>):Array<IntArray>{
    var tamaño=matriz.size
    var x=Random.nextInt(0,tamaño)
    var y= Random.nextInt(0,tamaño)
    matriz[x][y]=1
    return matriz
    
}

fun preguntaPosicion(x:Boolean):Int{
    if (x) {
        println("Dime donde crees que puede estar la mosca en el eje vertical")
    }
    else{
        println("Dime donde crees que puede estar la mosca en el eje horizontal")
    }
    return readln().toInt()
}

fun comprobarMoscaMatriz (m:Array<IntArray>,x:Int,y:Int){

}