import kotlin.random.Random

fun main () {
    var numrandom=0
    var dinero=0
    var color=""
    var num=0
    do {
        println("Elige un numero entre 1 y 35")
        num= readln().toInt()
    } while (num>36 || num<0)
    println("Elige un color")
    var colorE= readln()
    var colorrandom=0
    for (i in 0..4) {
        numrandom=Random.nextInt(1,36)
        colorrandom=Random.nextInt(0,2)
        when(colorrandom) {
            0-> color="Negro"
            1-> color="Rojo"
        }
        println(color)
        println(numrandom)
        if ((num==numrandom) && (colorE==color)) {
            dinero=dinero+100
        }
        else if ((num==numrandom) && (colorE!=color)){
            dinero=dinero+70
        }
        else if ((num!=numrandom)&& (colorE==color)){
            dinero=dinero+2
        }
        else {
            dinero=dinero-2
        }
        println("Te quedan $dinero dolares")
    }

}