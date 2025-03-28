package cafeteria

open class Mesa(open var numero: Int, open var capacidad: Int = 4, open var ocupada: Boolean = false) {
    open val tipo = "Mesa estándar"

    open var estado: String
        get() = if (ocupada) "Ocupada" else "Libre"
        set(valor) {
            ocupada = valor.lowercase() == "ocupada"
        }

    constructor(numero: Int, personas: Int) : this(numero) {
        capacidad = if (personas > 4) 6 else 4
        ocupada = personas > 0
    }

    open fun mostrarInfo() {
        println("$tipo N°$numero - Capacidad: $capacidad personas - Estado: $estado")
    }
}

class MesaVIP(numero: Int, override var capacidad: Int = 6) : Mesa(numero, capacidad) {
    override val tipo = "Mesa VIP"
    override var estado: String
        get() = if (ocupada) "Reservada" else "Disponible"
        set(valor) {
            ocupada = valor.lowercase() == "reservada"
        }

    init {
        ocupada = true
    }
}
