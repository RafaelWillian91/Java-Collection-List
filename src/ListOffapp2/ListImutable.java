package ListOffapp2;

import java.util.ArrayList;
import java.util.List;

public class ListImutable {

    public static void main(String[] args) {

        List.of();//Lista Vazia
        // List.of é imutável
        List.of("A", "B", "C", "D");

        //Como já declaro o tipo de tudo, não preciso do GENERICS para definir o tipo da lista
       // List<String> listImut = List.of("A", "B", "C", "D");
        List<String> listImut = List.of("A", "B", "C", "D");


        //Se for uma lista de objetos, voce pode manipular os elementos dos objetos.

        /*Não pode adicionar ou remover elementos
        listImut.clear();
        listImut.add("E");*/

        //O que pode ser feito é Mudar a Iplementação e passar a lis.of no Construtor
        List<String> NoimutableList = new ArrayList<>(List.of("A", "B", "C", "D"));
        System.out.println(NoimutableList);
        NoimutableList.clear();
        System.out.println(NoimutableList);
        System.out.println("---------------------------------");







    }
}
