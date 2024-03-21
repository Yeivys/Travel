fun main() {
    // Crear una instancia de NationalLowSeason y probar su funcionalidad
    val nationalLowSeason = NationalLowSeason("Monterrey")
    nationalLowSeason.quotePrice(5) // Obtener el precio cotizado
    nationalLowSeason.reserve(5)    // Reservar el viaje
    nationalLowSeason.reserve(3)    // Intentar reservar el viaje nuevamente (debería indicar que ya está reservado)
    nationalLowSeason.cancel()      // Cancelar el viaje
    nationalLowSeason.cancel()      // Intentar cancelar el viaje nuevamente (debería indicar que no se puede cancelar)

    println()

    // Crear una instancia de International y probar su funcionalidad
    val international = International("Alemania", "Berlín")
    international.quotePrice(7) // Obtener el precio cotizado
    international.reserve(7)    // Reservar el viaje
    international.reserve(7)    // Intentar reservar el viaje nuevamente (debería indicar que ya está reservado)

    println()

    // Crear una instancia de International para una ciudad no admitida
    val invalidInternational = International("Japón", "Tokio")
    invalidInternational.quotePrice(5) // Debería indicar que no se hacen viajes a esta ciudad

    println()

    // Probar una reserva fallida debido a una ciudad no admitida
    val invalidNational = National("Ciudad Imaginaria")
    invalidNational.quotePrice(3) // Debería indicar que no se hacen viajes a esta ciudad
    invalidNational.reserve(3)    // No debería reservar el viaje

    println()

    // Probar una reserva con descuento en temporada baja
    val nationalLowSeasonDiscount = NationalLowSeason("Guadalajara")
    nationalLowSeasonDiscount.quotePrice(5) // Obtener el precio cotizado con descuento
    nationalLowSeasonDiscount.reserve(5)    // Reservar el viaje

    println()

    // Probar obtener el precio cotizado para una ciudad nacional que no está en la lista de tarifas
    val unknownCityNational = National("Pueblo Desconocido")
    unknownCityNational.quotePrice(3) // Debería indicar que no se hacen viajes a esta ciudad

    println()

    // Probar obtener el precio cotizado para una ciudad internacional que no está en la lista de tarifas
    val unknownCityInternational = International("Francia", "París")
    unknownCityInternational.quotePrice(5) // Debería indicar que no se hacen viajes a esta ciudad

    println()

    println("¡Pruebas completadas con éxito!")
}

