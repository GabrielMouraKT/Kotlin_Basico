fun main (){
    //Estrutura de repetição While (enquanto)

                        // Indice  //0     //1      //2     //3     //4     //5    //6       //7    //8     //9
    var listadecompras = arrayOf("Arroz","Feijão","Açucar","Leite","Carne","Uva","Batata","Banana","Ovos","Frango",)

    var indice = 0
    println(listadecompras.size)

        //Enquanto a condição do while for verdadeiro ira ficar em loop se for false terminano loop.
    while (indice <= listadecompras.size -1 ){

        println(listadecompras[indice])
        indice++


     }
}

