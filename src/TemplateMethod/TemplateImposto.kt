package TemplateMethod

abstract class TemplateImposto : Imposto {
    override fun calcular(orcamento: Orcamento): Double {
        return if (deveAplicarTaxaMaxima(orcamento)) {
            aplicarTaxaMaxima(orcamento)
        } else {
            aplicarTaxaMinima(orcamento)
        }
    }

    abstract fun deveAplicarTaxaMaxima(orcamento: Orcamento): Boolean
    abstract fun aplicarTaxaMaxima(orcamento: Orcamento) : Double
    abstract fun aplicarTaxaMinima(orcamento: Orcamento) : Double
}