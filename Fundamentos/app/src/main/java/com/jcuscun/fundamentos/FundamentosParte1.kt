package com.jcuscun.fundamentos

fun main() {
    // Comentario de una linea


    /*
    Comentario de
    varias
    lineas
    * */


    //DECLRACION DE VAL Y VAL
    // Declaracion sin tipado
    // para nombrar una variable es mejor si el nombre empieza con letra minuscula

    val nombreAnimal = "perro"
    var edadAnimal = 3


    // DECLARACIONES CON TIPADO------------------------------------------

    val pesoAnimal = 3.5
    // Se le agrega la "f" es para representar la variable tipo Float.
    val tamanioAnimal = 1.5f
    var raza: Char = 'A'

    //Diferencia entre var y val
    // nombreAnimal = 'gato'// no es posible reasignar un valor porque es tipo VAL
    // edadAnimal = 5// es mutable por ende se le puede agregar un valor

    // imprimir valores
println(10)
    println(nombreAnimal)
    println(edadAnimal)
    println(pesoAnimal)
    print(raza)

}

