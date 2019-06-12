package ChainOfResponsibility

fun main() {
    val pedido = Pedido("João da Silva")

    pedido.itensPedido.add(Item("Notebook", 3000.0))
    pedido.itensPedido.add(Item("Cadeira Gamer", 1400.0))
    pedido.itensPedido.add(Item("Monitor de 23°", 1800.0))
    pedido.itensPedido.add(Item("SSD 240GB", 190.0))
    pedido.itensPedido.add(Item("Cafeteira Elétrica", 200.0))

    pedido.fechar()

    println(pedido.valorTotal)
}