package Interpreter

class Numero(val valor: Int) : Expressao {
    override fun avaliar(): Int {
        return valor
    }
}