package Interpreter

class Menor(val esquerda: Expressao, val direita: Expressao) : ExpressaoBooleana {
    override fun avaliar() = esquerda.avaliar() < direita.avaliar()


}