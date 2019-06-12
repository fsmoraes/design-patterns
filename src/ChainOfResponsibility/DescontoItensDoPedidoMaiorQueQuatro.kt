package ChainOfResponsibility

class DescontoItensDoPedidoMaiorQueQuatro : Desconto() {
    override fun calcular(pedido: Pedido): Double {
        val desconto = if (pedido.itensPedido.size > 4) 0.1 else 0.0
        return desconto + proximo.calcular(pedido)
    }


}