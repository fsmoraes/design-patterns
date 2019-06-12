package ChainOfResponsibility

class CalculadoraDesconto(val pedido: Pedido) {
    fun calcular(): Double {
        val d1 = DescontoValorPedidoMaiorQueCincoMilReais()
        val d2 = DescontoItensDoPedidoMaiorQueQuatro()
        val d3 = SemDesconto()

        d1.proximo = d2
        d2.proximo = d3

        return d1.calcular(pedido)
    }
}