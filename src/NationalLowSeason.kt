import interfaces.Cancellable
import interfaces.IPromotion

// Implementar la interfaz Cancelable en la clase NationalLowSeason

// Clase para representar un viaje nacional durante la temporada baja
// Clase NationalLowSeason que implementa la interfaz Cancellable
class NationalLowSeason(city: String) : National(city), Cancellable, IPromotion {
    override val discount = 10
    override val typeDiscount = 0

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }

    override fun cancel() {
        if (!reserved) {
            println("No se puede cancelar un viaje que no ha sido reservado.")
        } else {
            reserved = false
            paidAmount = 0
            println("Tu viaje a $city ha sido cancelado.")
        }
    }

    override fun getDiscountPrice(amount: Int): Int {
        return (amount * (100 - discount)) / 100
    }
}


