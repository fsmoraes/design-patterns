package ChainOfResponsibility

class DescontoValorPedidoMaiorQueCincoMilReais : Desconto() {
    override fun calcular(pedido: Pedido): Double {
        val desconto = if (pedido.valorTotal > 5000.0) 0.1 else 0.0
        return desconto + proximo.calcular(pedido)
    }
}

