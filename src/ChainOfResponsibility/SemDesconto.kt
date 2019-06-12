package ChainOfResponsibility

class SemDesconto : Desconto() {
    override fun calcular(pedido: Pedido) = 0.0
}