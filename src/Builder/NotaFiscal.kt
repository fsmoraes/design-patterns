package Builder

class NotaFiscal(
    val razaoSocial: String,
    val cnpj: String,
    val valor: Double,
    val impostos: Double,
    val observacoes: String,
    val itensNota: Array<ItemNota>
)