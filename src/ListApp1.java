import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp1 {

    public static void main(String[] args) {

        //Classes que implementam a interface List podem criar objetos do seu tipo
        var list = new ArrayList<Integer>();
        List<Integer> lis2 = new ArrayList<>();
        //List não aceitam tipos primitivos.

        //Pada adicionar elementos
        lis2.add(4);
        lis2.add(3);
        lis2.add(6);
        lis2.add(8);
        //list aceita elementos duplicados
        lis2.add(8);
        
        //Para interar em uma list

        for (Integer i: lis2) {
            //A list mantem a ordem de inserção e tem items duplicados
            System.out.println(i);
        }

        System.out.println("---------------------------------");
        //List tem um indice
        System.out.println(lis2.get(1));

        //Grande Vantagem do ArrayList é que internamente ele cria um array e ele mesma gerencia o tamanho
        //desse array. Internamente ele cria um novo, copia os elementos e vai aumentando o array.
        //Inclusive ele aceita nos seu parametros um idice inicial caso o programador queira

        lis2.remove(2);
        //O elemento pode ser retirado que arraylist não deixa buracos igual os arrays
        System.out.println(lis2);

        //Posso mudar a implelentacao que tudo continua funcionando
       // List<Integer> lis2 = new LinkedList<>();

    }
}
