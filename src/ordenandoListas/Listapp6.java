package ordenandoListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Ordenar uma Lista
public class Listapp6 {

    public static void main(String[] args) {

        List list = new ArrayList<Integer>(List.of(1, 4, 0, 5, 3, 2));
        System.out.println(list);

        //Existe uma classe que faz parte da Collection api chamada Collections
        //Essa classe tem uma série de métodos estáticos que ordena a propria lista
        //O método .sort compara os elementos da lista para saber se vem antes ou depois
        //Para poder chamar o método sort o Tipo da Lista tem que implementar a Interface Comparable
        //Integer implementa Comparable, então essa lista pode ser submetido ao método sort
        /*public final class Integer extends Number
               implements Comparable<Integer>, Constable, ConstantDesc { */

        //Esse Comparable tem um método chamado CompareTo que faz a comparacao de um valor com outro e retorna um
        //inteiro. 0 se são iguais. menor que 0 se este número é menor ou maior que 1 caso contrario.
        //Integer.compare é chamado internamente pelo CompareTo o efeito é o mesmo

        int a = Integer.compare(1,4);
        System.out.println(a);

        Collections.sort(list);

        /*String tambem implementa a interface Comparable, portanto ela tambem tem o método compareTo
        que ordena algo (posso implementar essa interface para ordenar algo).

         */

        List list2 = new ArrayList<String>(List.of("B", "C", "A", "D"));
        //O metodo sort internamente vai chamar o compareTo
        Collections.sort(list2);

        System.out.println(list2);


    }
}
