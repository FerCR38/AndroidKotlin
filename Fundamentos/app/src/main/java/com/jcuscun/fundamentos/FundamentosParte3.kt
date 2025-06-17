package com.jcuscun.fundamentos

import android.R

fun main () {

    //Funcion Simple
    hola()
 // Funcion con parametro
 unirNombreYApellido("Keyly", "Herrera")

    // Funcion con retorno



}

// FUNCIONES PROPIAS
fun hola () {
    println("Hola")

}
// FUNCION SIMPLE
// Palabra reservada "fun" define una funcion
// "hola" es el nombre o identificador
// (): Tipo de dato para el retorno de una funcion
// () apartado de parametrizacion
// {} cuerpo de la funcion


//FUNCION CON PARAMETROS (parametrizar una funcion)
//Para agregar otro parametro se agrega una coma

fun unirNombreYApellido(nombre: String, apellido:String ){

    val union:String = "$nombre $apellido"
    println(union)




// FUNCION CON RETORNO

    fun miNumero (): Double{
        val miPi: Double= 3.14
        return miPi
    }

}