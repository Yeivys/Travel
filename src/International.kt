import abstracts.Travel

// Clase International para viajes internacionales
// Clase International para viajes internacionales
class International(override val country: String, override val city: String) : Travel() {
    private val fees = mapOf(
        "Alemania" to 0.16,
        "Chile" to 0.05,
        "Canadá" to 0.10
    )

    private val citiesPrices = mapOf(
        "Alemania" to mapOf(
            "Munich" to 980,
            "Berlín" to 820,
            "Francfort" to 850
        ),
        "Chile" to mapOf(
            "Santiago" to 643,
            "Valparaíso" to 721
        ),
        "Canadá" to mapOf(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600
        )
    )

    override fun getPrice(numDays: Int): Int {
        val basePrice = citiesPrices[country]?.get(city) ?: 0
        val tax = fees[country] ?: 0.0
        return ((basePrice * numDays) * (1 + tax)).toInt()
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if (price == 0) {
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else {
            println("Tu viaje a $city, $country cuesta \$$price")
        }
    }
}