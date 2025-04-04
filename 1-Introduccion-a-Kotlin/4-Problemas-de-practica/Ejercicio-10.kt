fun main() {
    val primeraCiudad = "Ankara"
    val primeraTempMin = 27
    val primeraTempMax = 31
    val primeraProbLluvia = 8
    imprimirDatos(primeraCiudad, primeraTempMin, primeraTempMax, primeraProbLluvia)

    val segundaCiudad = "Tokyo"
    val segundaTempMin = 32
    val segundaTempMax = 36
    val segundaProbLluvia = 10
    imprimirDatos(segundaCiudad, segundaTempMin, segundaTempMax, segundaProbLluvia)
    
    val terceraCiudad = "CapeTown"
    val terceraTempMin = 59
    val terceraTempMax = 64
    val terceraProbLluvia = 2
    imprimirDatos(terceraCiudad, terceraTempMin, terceraTempMax, terceraProbLluvia)
    
    val cuartaCiudad = "Guatemala City"
    val cuartaTempMin = 50
    val cuartaTempMax = 55
    val cuartaProbLluvia = 7
    imprimirDatos(cuartaCiudad, cuartaTempMin, cuartaTempMax, cuartaProbLluvia)
}

fun imprimirDatos(ciudad: String, tempMin: Int, tempMax: Int, probLluvia: Int) {
    println("City: $ciudad")
    println("Low temperature: $tempMin, High temperature: $tempMax")
    println("Chance of rain: $probLluvia%")
    println()
}