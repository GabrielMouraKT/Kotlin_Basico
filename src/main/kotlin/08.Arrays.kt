import java.util.*

fun main (args: Array<String>){
    //Arrays
                        // Indice //0      //1      //2     //3
    var listadecompras = arrayOf("Arroz","Feijão","Açucar","Leite",
        "Carne","Uva","Batata","Banana","Ovos","Frango",1,2.5)  //Kotlin aceita dentro do array qualquer variavel.
          //4   //5     //6      //7     //8     //9  //10 //11

    var listaNumeros = arrayOf(10,20,30,40,50)

    println(listaNumeros[4])    //Exibe o item do indice escolhido.
    println(listadecompras[7]) //Exibe o item do indice escolhido.
    println(listadecompras.contentToString()) //Exibe a lista toda
    println(listadecompras.size) //Tamanho da lista
}