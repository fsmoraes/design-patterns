package Strategy

fun main() {
    val icms = ICMS()
    val iss = ISS()
    val orcamento = Orcamento(500.0)

    println(icms.calcular(orcamento))
    println(iss.calcular(orcamento))
}