package TemplateMethod

fun main() {
    val icms = ICMS()
    val iss = ISS()
    val orcamento = Orcamento(600.0)

    println(icms.calcular(orcamento))
    println(iss.calcular(orcamento))
}