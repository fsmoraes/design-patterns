package Strategy

class ICMS : Imposto {
    override fun calcular(orcamento: Orcamento): Double {
        return orcamento.valor * 0.1
    }
}