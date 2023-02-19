fun main() {

// cree un algoritmo que permita mostrar los numeros unicos de una lista


        val numbers = listOf(3, 7, 1, 9, 4, 2, 8, 5, 6, 7, 5, 3, 1, 8)//

        val uniqueNumbers = numbers.distinct() // distinct() es un método de la clase List
    // que permite obtener una lista con los elementos únicos de la lista original

        println("Los números únicos son: $uniqueNumbers")// imprime los números únicos




}