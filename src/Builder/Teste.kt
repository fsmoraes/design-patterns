package Builder

fun main() {
    val builder = NotaFiscalBuilder()

    val notaFiscal = builder.paraEmpresa("Falcon corp.")
        .comCnpj("99.815.902/0001-43")
        .comItem(ItemNota("Teclado Gamer", 200.0))
        .comItem(ItemNota("SSD Kingston 240GB", 188.9))
        .comObservacao("Observação")
        .construir()

    println(notaFiscal.valor)
    println(notaFiscal.impostos)
}