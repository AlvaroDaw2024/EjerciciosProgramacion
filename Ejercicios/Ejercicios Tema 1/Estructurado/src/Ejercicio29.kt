 /*
 Realiza un algoritmo que introducidas las notas de N alumnos nos indicará cuantos aprobados y cuantos suspensos hay.
  Generaliza este ejercicio para una cantidad indefinida de notas (pararemos con una nota negativa).
  Amplia el ejercicio indicando no solo cuantos aprobados hay, también cuantos sobresalientes, notables, bienes, aprobados y suspensos.
  */
/*
 fun main() {
     var nalum:Int
     var cont = 0
     var aprobado:Int = 0
     var suspenso:Int = 0
     println("Este programa realiza un algoritmo que introducidas las notas de N" +
             " alumnos nos indicará cuantos aprobados y cuantos suspensos hay")
     println("Cuantos alumnos tiene tu clase?")
     nalum = readln().toInt()
     do {
         cont++
         println("Dime las notas del $cont alumno")
         var num = readln().toInt()
         if (num > 10 || num < 0) {
             println("Numero no valido")
             cont--
         } else {
             if (num > 4) {
                 aprobado++
             } else if (num < 4) {
                 suspenso++
             }
         }
     } while (nalum != cont)
     println("En esta clase de $nalum alumnos hay $aprobado aprobados y $suspenso suspensos")
 }
 */

 fun main() {
     var num = 0
     var nalum:Int = 0
     var cont = 0
     var aprobado:Int = 0
     var bien = 0
     var notable = 0
     var sobresaliente = 0
     var suspenso:Int = 0
     var total = 0
     println("Este programa realiza un algoritmo que introducidas las notas de N" +
             " alumnos nos indicará cuantos aprobados y cuantos suspensos hay")
     do {
         nalum ++
         println("Dime las notas del $nalum alumno")
         num = readln().toInt()
         if (num > 10 || num < 0) {
             println("Numero no valido")
             nalum--
         }
         else {
             if (num == 5) {
                 aprobado++
             }
             else if (num == 6){
                 bien++
             }
             else if(num == 7 || num == 8) {
                 notable++
             }
             else if (num == 9 || num == 10) {
                 sobresaliente++
             }
             else {
                 suspenso++
             }
             total = aprobado + bien + notable + sobresaliente
         }
     } while (num > 0)
     println("En esta clase de $nalum alumnos hay $total aprobados, de los cuales hay $bien bien/es, $notable notable/s y " +
             "$sobresaliente sobresaliente/s.")
             if (suspenso != 0){
                 println("Por desgracia tambien hay $suspenso suspensos")
             }
 }