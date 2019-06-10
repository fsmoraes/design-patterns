package TemplateMethod

class ICMS : TemplateImposto() {
    override fun deveAplicarTaxaMaxima(orcamento: Orcamento): Boolean {
        return orcamento.valor > 500
    }

    override fun aplicarTaxaMaxima(orcamento: Orcamento): Double {
        return orcamento.valor * 0.1
    }

    override fun aplicarTaxaMinima(orcamento: Orcamento): Double {
        return orcamento.valor * 0.05
    }
}