fun main (){
    //Estrutura When
    //(condição)

    var opçao = 1

    // - > lambda
//    when (opçao){
//        1 -> println("Suco de Laranja")
//        2 -> println("Suco de Uva")
//        3 -> println("Suco de Morango")
//        4 -> println("Suco de Cupuaçu")
//        else -> println("Nenhuma opção foi selecionada")

  //  }
    var mensagem = when (opçao){
        1 -> "Suco de Laranja"
        2 -> "Suco de Uva"
        3 -> "Suco de Morango"
        4 -> "Suco de Cupuaçu"
        else -> "nenhuma opção foi selecionada"
    }
    println(mensagem)
}