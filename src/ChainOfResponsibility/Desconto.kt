package ChainOfResponsibility

abstract class Desconto {
    lateinit var proximo: Desconto

    abstract fun calcular(pedido: Pedido): Double
}