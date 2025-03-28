package cafeteria

fun main() {
    println("☕ Bienvenido a la Cafetería Kotlin ☕\n")

    // Mesas
    val mesa1 = Mesa(1)
    val mesa2 = Mesa(2, personas = 5)
    val mesa3 = MesaVIP(3)

    mesa1.mostrarInfo()
    mesa2.mostrarInfo()
    mesa3.mostrarInfo()

    println("\n🔄 Cambiando estado de mesa 1 a 'ocupada'...")
    mesa1.estado = "ocupada"
    mesa1.mostrarInfo()

    println("\n👩‍🍳 Personal trabajando:\n")
    val empleado1 = Mesero("Lucía")
    val empleado2 = Barista("Carlos")

    println("${empleado1.nombre} - ${empleado1.cargo}")
    empleado1.realizarTarea()

    println("${empleado2.nombre} - ${empleado2.cargo}")
    empleado2.realizarTarea()
}
