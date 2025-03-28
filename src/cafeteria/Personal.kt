package cafeteria

abstract class Empleado {
    abstract val nombre: String
    abstract val cargo: String
}

interface AccionEmpleado {
    fun realizarTarea()
}

class Mesero(override val nombre: String) : Empleado(), AccionEmpleado {
    override val cargo = "Mesero"
    override fun realizarTarea() = println("$nombre está sirviendo pedidos.")
}

class Barista(override val nombre: String) : Empleado(), AccionEmpleado {
    override val cargo = "Barista"
    override fun realizarTarea() = println("$nombre está preparando café.")
}
