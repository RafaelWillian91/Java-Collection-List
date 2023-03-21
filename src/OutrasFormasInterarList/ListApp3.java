package OutrasFormasInterarList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApp3 {

    public static void main(String[] args) {

        var list = new ArrayList<>(List.of("A", "B", "C", "D"));

        //A primeira forma é a classica, onde ocorre o controle dos elementos da lista
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            //list.remove("C");
        }
        System.out.println("__________________________");

        //A outra é com Iterator
        //Objetos java que tem serie de elementos tem um método chamado interator() que retorna a colecao
        //O Generics do Interator é sempre o da propria lista
        Iterator<String> interator = list.iterator();

        //O interar tem um método chamado hasNext() que verifica se tem um proximo elemento para ele percorrer
        while (interator.hasNext()){
            //Se tem eu chamdo o .next() para chamar o proximo da fila
            String s = interator.next();
            System.out.println(s);
            //O iterator tem um método que cuida da remocao
            if(s.equals("B")){
                interator.remove();
            }
        }
        System.out.println(list);
    }

}
