fun main (){

    /*  Define-se nomedavariavel: Tipo = valor
    Na linguagem Kotlin não é necessario definir o tipo de variavel, exceto quando
    for Byte.
    Kotlin "Sabe" o Tipo de variavel atraves do valor "
    */

    //String//
    val nomeCompleto: String = "Gabriel Cursino de Jesus Moura"
    println("Seu nome completo é $nomeCompleto")

    //Byte//
    val idade: Byte = 28
    println("Sua idade é $idade")

    //Int//
    val telefone: Int = 999999999
    println("Seu telefone é $telefone")

    //Long//
    val distanciametros: Long = 100000000000
    println("Distancia em metros é de $distanciametros")

    //float//
    val altura: Float = 1.8f
    println("Sua altura é de $altura")

    //Double//
    val dinheiro: Double = 2.000000
    println("Seu saldo bancario é de $dinheiro")

    //Boolean True//
    val casamento = true
    println("Vai ter casamento sim? $casamento")

    //Boolean False//
    val morrer = false
    println("Voce vai morrer? $morrer")

    /*
   String = Textos
   Byte = Números Inteiros (-128 até 127)
   Int = Números Inteiros (-2147483648 até 2147483647)
   Long = Numeros Inteiros (-9223372036854775808 até 9223372036854775807)
   Float = Numeros Decimais (1.1234567 até 7 casas decimais)
   Double = Numeros Decimais (1.123456789 até 15 casas decimais)
   Boolean = Valores Booleanos (Estados) - true ou false
    */

}