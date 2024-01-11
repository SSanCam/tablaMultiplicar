import java.lang.NumberFormatException

/**
     * Solicita un número entero en un rango.
     *
     * @param min Int - valor mínimo
     * @param max Int - valor máximo
     *
     * @return Int - número entero válido dentro del rango especificado
     */
fun pedirNum(): Int {

    try {
        println("Introduzca un número entre 1 y 100: \n")
        var numeroIntroducido = readln().toInt()
        while (numeroIntroducido !in 1..100){
            println("ERROR\nDebe introducir un número entre 1 y 100:\n")
            numeroIntroducido = readln().toInt()
        }
        return numeroIntroducido
    }catch (e: NumberFormatException){
        println ("ERROR\nDebes introducir un número entre 1 y 100")
        return 0
    }
}
    /**
     * Realiza una pregunta para contestar con s/si ó n/no
     *
     * @param text String - Texto de la pregunta
     *
     * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
     */
fun pregunta(): Boolean {

    try {
        println("¿Desea generar otra tabla de multiplicación? (s/n)")
        var respuesta = readln().toLowerCase()

        while (respuesta != "s" && respuesta != "n"){
            println("ERROR.\nRespuesta no válida.\n¿Desea generar otra tabla de multiplicación? (s/n)")
            respuesta = readln().toLowerCase()
        }

        if (respuesta == "s"){
            return true
        }else{
            println("Saliendo del programa.")
            return false
        }
    }catch (e: IllegalArgumentException){
        println("ERROR - 404")
        return false
    }
}

    fun main() {
        //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
        //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"
        var seguir = true
        try {

            while (seguir){
                val numero = pedirNum()
                println("La tabala de multiplicar del número $numero es:\n")

                for (num in 0..10) {
                    println("$num * $numero = ${num * numero}")
                }
                seguir = pregunta()
            }

        }catch (e: IllegalArgumentException){
            println("ERROR - 404")
        }
    }