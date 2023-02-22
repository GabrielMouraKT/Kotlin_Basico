fun main (){
    //Estrutura de repetição For (para)

                        // Indice  //0     //1      //2     //3     //4     //5    //6       //7    //8     //9
    var listadecompras = arrayOf("Arroz","Feijão","Açucar","Leite","Carne","Uva","Batata","Banana","Ovos","Frango",)

    var indice = 0
    println(listadecompras.size)

              //in = intervalo
    for (indice in 0..9){  // 0 until 10

        println(listadecompras[indice])

    }

}

