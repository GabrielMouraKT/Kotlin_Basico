fun main() {
    println("Digite sua idade")
    var idade: Int = readln().toInt()

    if (idade <= 10) {

        println("Usuario é criança")

    } else if (idade <= 17) {
        println("Usuario é adolescente")

    } else {
        println("Usuario é adulto")
    }
}
/*Se (if) dentro do parenteses vai ter a condição.
Senão (else)
Estrutura condicionais*/