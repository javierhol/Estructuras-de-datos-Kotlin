fun main(){
    //Haga un algoritmo de un conjunto de números y que los calcule y leugo los muestre en orden ascendente


    val numbers = setOf(3, 7, 1, 9, 11, 2, 8, 5, 10)

    var sum = 0
    for (number in numbers) {
        sum += number
    }

    val prom= sum / numbers.size.toDouble()

    println("El promedio es: $prom")

    val numbers2 = numbers.sorted() // sorted() es un método de la clase Set el cual permite ordenar los elementos de la lista

    println("Los números en orden ascendente son: $numbers2")





}