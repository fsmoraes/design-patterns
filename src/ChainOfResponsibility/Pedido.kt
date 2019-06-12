package ChainOfResponsibility

class Pedido(val comprador: String) {
    val itensPedido = mutableListOf<Item>()
    var valorTotal = 0.0
        private set

    fun fechar() {
        valorTotal = itensPedido.map { it.valor }.sum()

        val desconto = CalculadoraDesconto(this).calcular()

        valorTotal -= valorTotal * desconto
    }
}