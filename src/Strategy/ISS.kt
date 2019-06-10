package Strategy

class ISS : Imposto {
    override fun calcular(orcamento: Orcamento): Double {
        return orcamento.valor * 0.05
    }
}