fun main() {
    val tiempoDedicadoHoy = 300
    val tiempoDedicadoAyer = 250
    
    println("¿Pasé más tiempo hoy en el celular que ayer?: ${compararTiempos(tiempoDedicadoHoy, tiempoDedicadoAyer)}")
}

fun compararTiempos(tiempoHoy: Int, tiempoAyer: Int): Boolean {
    return tiempoHoy > tiempoAyer
}