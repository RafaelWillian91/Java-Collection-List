package OperacoesEntreDuasListas;

import java.util.ArrayList;
import java.util.List;

public class ListApp5 {

    public static void main(String[] args) {

        List list = new ArrayList<>(List.of('A', 'b', 'C', 'D'));
        List list2 = new ArrayList<>(List.of('D', 'E', 'F', 'G'));

        //O metodo addAll aceita outra lista inteira
       // list.addAll(list2);
        System.out.println(list);//saida: [A, b, C, D, D, E, F, G]

        //Retorna a Intersecção
      //  list.retainAll(list2);
        System.out.println(list);

        //Metodo Retorna os elementos que não de repetem.
        list.removeAll(list2);
        System.out.println(list);
    }

}
