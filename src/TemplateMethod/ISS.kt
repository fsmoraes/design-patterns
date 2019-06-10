package TemplateMethod

class ISS : TemplateImposto() {
    override fun deveAplicarTaxaMaxima(orcamento: Orcamento): Boolean {
        return orcamento.valor > 200
    }

    override fun aplicarTaxaMaxima(orcamento: Orcamento): Double {
        return orcamento.valor * 0.05
    }

    override fun aplicarTaxaMinima(orcamento: Orcamento): Double {
        return orcamento.valor * 0.01
    }
}