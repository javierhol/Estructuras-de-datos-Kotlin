fun main(){

    //Crear una lista de pares que contengan nombres y edades, y luego filtrar los pares cuyas edades sean mayores o iguales a 18.


    val personas = listOf(
        Pair("Juan", 30),
        Pair("Ana", 25),
        Pair("Pedro", 17),
        Pair("Luisa", 20)

    ) // lista de pares que contienen nombres y edades

    val mayoresDeEdad = personas.filter { it.second >= 18 } // filter() es un método de la clase List que permite filtrar los elementos de la lista
    mayoresDeEdad.forEach { println("${it.first} tiene ${it.second} años") }// imprime los nombres y edades de las personas mayores de edad




}