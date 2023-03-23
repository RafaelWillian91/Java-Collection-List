package ConversaoArrayParaListas;

import java.util.Arrays;
import java.util.List;

public class ListApp4 {

    public static void main(String[] args) {

        //**********  De Array para List  **********//
        Integer[] array = {4, 2, 6, 0, 8};

        //Para fazer isso dentro da classe Arrays uma série de método estáticos e um deles é o .asList()
        //Precisa informar o tipo de Dado que vai voltar no Array Senão a lista não sabe como retornar alguns métodos
        List<Integer> list = Arrays.asList(array);
        //Não posso imprimir uma lista de tipos primitivos, entao passo para Integer o array
        System.out.println(list);

        //Criacao de Lista com Array usando o método .asList
        List<Integer> array4 = Arrays.asList(new Integer[] {1,2,4,5,3,2,5});
        System.out.println(array4);


        //**********  De List para Array  **********//
        Integer[] array2 = list.toArray(new Integer[0]);

        //As List tem um método para conversao para Array .toArray(Passo o tipo de Array que sera criado)
        System.out.println(Arrays.toString(array2));



    }

}
