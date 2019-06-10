package Interpreter

fun main() {
    val esquerda = Numero(10)
    val direita = Numero(100)

    val expressaoMaior = Maior(esquerda, direita)
    val expressaoMenor = Menor(esquerda, direita)

    println(expressaoMaior.avaliar())
    println(expressaoMenor.avaliar())
}