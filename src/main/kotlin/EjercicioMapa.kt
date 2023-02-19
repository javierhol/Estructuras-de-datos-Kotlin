fun main(){
    // haga un algoritmo que permita calcuolar el salario de 5 empleados y hacerun aumento del 30% a los empleados que ganen menos de 1000

    val empleados = mapOf("Juan" to 1000, "Pedro" to 2000, "Maria" to 300, "Luis" to 4000, "Ana" to 700)

    val aumento = empleados.mapValues { (key, value) ->
        if (value <= 1000) value * 3.0 else value
    }// mapValues() es un método de la clase Map que permite aplicar una función a cada
    // elemento de la lista y devolver un nuevo Map con los resultados

    println("El salario de los empleados es: $aumento")


}