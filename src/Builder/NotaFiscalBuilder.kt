package Builder

import kotlin.math.round

class NotaFiscalBuilder {

    private var razaoSocial = ""
    private var cnpj = ""
    private var observacao = ""
    private var itensNota = mutableListOf<ItemNota>()
    private var valorTotal = 0.0
    private var impostos = 0.0

    fun paraEmpresa(razaoSocial: String): NotaFiscalBuilder {
        this.razaoSocial = razaoSocial
        return this
    }

    fun comCnpj(cnpj: String): NotaFiscalBuilder {
        this.cnpj = cnpj
        return this
    }

    fun comItem(itemNota: ItemNota): NotaFiscalBuilder {
        itensNota.add(itemNota)
        valorTotal += itemNota.valor
        impostos += itemNota.valor * 0.01
        return this
    }

    fun comObservacao(observacao: String): NotaFiscalBuilder {
        this.observacao = observacao
        return this
    }

    fun construir(): NotaFiscal =
        NotaFiscal(razaoSocial, cnpj, valorTotal, round(impostos), observacao, itensNota.toTypedArray())

}