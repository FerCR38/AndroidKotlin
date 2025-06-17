package com.jcuscun.fundamentos
fun main () {
    condicionConWhen()
}

fun condicionConWhen(){

    val dia=1
    when (dia){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> print("Numero de dia no correcto")

    }

}

fun CondicionConWhen2(nota:Int?){
    // Analizar la nota de un estudiante

    if(nota == null){
        println("Porfavor Ingrese una nota")
    }
    else {
        val resultado = when (nota){
            in 0..5 -> "REPROBADO"
            6,7 -> "REGULAR"
            8,9 -> "BUENO"
            10 -> "EXCELENTE"
            else -> "Nota Invalida"
        }

        println(resultado)

    }

    fun condicionConWhen3(): Int{

        val x = 1
        val retorno = when (x){

            in 0..9 -> 1
            in 10..99 ->10
            in 100..999 -> 100

        }

    }
}