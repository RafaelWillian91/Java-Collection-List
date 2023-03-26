package exercise01ListNumbers;

import java.util.*;

public class Exercise01 {

    private static Random r = new Random();
    public static void main(String[] args) {

        System.out.println(numbers(10));

    }

    private static List<Integer> numbers(int x){
        //new ArrayList<Integer>(x); o java cria um array list com o tamanho especificado
        List<Integer> listNumbers = new ArrayList<Integer>(x);

        for (int i = 0; i <= x; i++) {
            listNumbers.add(r.nextInt(101));
        }
       // listNumbers.sort(Comparator.naturalOrder());
        Collections.sort(listNumbers);
        //Posso returnar uma lista que não pode mais ser alterada
        return Collections.unmodifiableList(listNumbers);
    }
}
