package Interpreter

class Maior(val esquerda: Expressao, val direita: Expressao) : ExpressaoBooleana {
    override fun avaliar() = esquerda.avaliar() > direita.avaliar()
}