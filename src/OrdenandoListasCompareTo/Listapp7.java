package OrdenandoListasCompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listapp7 {

    //Podemos criar a nossa propria regra para ordenar uma lista
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 3, 5, 6, 2, 4));

        List<String> list2 = new ArrayList<>(List.of("A", "C", "D", "E", "B"));



        //Aproveito o Comparable de Integer
        Collections.sort(list2);
        System.out.println(list2);
        //Dentro da interface List temos o método default list.sort que recebe um Comparator, que podemos colocar a nossa
        //propria implementacao para ordenar o tipo da lista de acordo com o que precisamos. Criamos uma classe e impl
        //O metodo sort tem uma sobrecarga que recebe um Comparator para determinarmos a nossa propria regra de comparacao
       // Collections.sort(list2, new DescendingList());//Tem que ser um Comparator do Tipo da Classe passada no primeiro parametro.

        //Interface Comparable tem um metodo compareTo() para ordenar as coisas
        //Sempre que quisermos ordenar uma classe fazemos ela implementar o Comparable
        //Integer implementa Comparable e da vida ao compareTo
        //String implementa Comparable e da vida ao compareTo
        //Por isso, ao criar uma list de String e chamar o .sort a Lista sera ordenada
        System.out.println(list2);

        list2.sort(new DescendingList());//Aqui foi passado um Comparator criado implementando Comparator
        System.out.println(list2);

        //Internamente Collections.sort(); leva em consideração se a classe passada implementa a interface Comparable
        //e a Classe que implementou Comparable sobrescreveu o metodo compareTo() que chama o metodo compare()
        //Collections.sort() chama internamente o método list.sort, já com os parametros de Comparable implementados
        //Se chamamos diretamente list.sort temos que ter já implementado Comparator
        list.sort(new DescendingList());

        System.out.println("-------------------------------------------");
        System.out.println(list);

        list.sort(new DescendingList());
        System.out.println(list);
        //Posso usar os métodos default da interface
        list.sort(new DescendingList().reversed());
        System.out.println(list2);

        Collections.sort(list);
        System.out.println(list);

        //O mais comum hoje é usar uma expressão lambda
        list.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println("--------------------------------------------");
        //Para uma ordem natural das coisas já existem métodos da Propria interface Comparator
        list.sort(Comparator.reverseOrder());
        System.out.println(list);






    }
}
