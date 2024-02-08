class Coche(override var motorEncendido: Boolean = false, override var kmHora: Int) :Vehiculo, EncendidoApagado {
    override fun acelerar(num: Int) {
        if (motorEncendido) this.kmHora+= num.also{ println("El coche va a ${this.kmHora + num} km/h") }
    }

    override fun frenar(num: Int) {
        if (motorEncendido) this.kmHora-= num.also{ println("El coche va a ${this.kmHora + num} km/h") }
    }

    override fun encender() {
        if (!motorEncendido) this.motorEncendido = true.also { println("El coche se ha encendido") }
        else println("El coche ya está encendido")
    }

    override fun apagar() {
        if (motorEncendido) this.motorEncendido = false.also { println("El coche se ha apagdo") }
        else println("El coche ya está apagado")
    }

    override fun toString(): String {
        return "Encendido = ${this.motorEncendido}, Velocidad = ${this.kmHora}"
    }
}