fun main() {
   var matriz = Array(3) {IntArray(3){0} }
   for (i in matriz.indices) {
       for (j in matriz.indices) {
           matriz[j][i]= readln().toInt()
       }
   }
    for (i in matriz.indices) {
        for (j in matriz.indices) {
            print("Fila ")
            println(matriz[i][j]) //lee la fila entera
            print("Columna ")
            println(matriz[j][i]) //lee la columna entera
        }
    }
}