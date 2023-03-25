package OrdenandoListasObjetosClassesCustomizadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Listapp8 {

    public static void main(String[] args) {

        var listPeoples = new ArrayList<Person>();
        //List<Person> listPeoples = new ArrayList<Person>();
        //Se eu não passar o Tipo da Lista a expressão lambda não funciona. O tipo var não precisa.

        listPeoples.add(new Person("Patricia", 30));
        listPeoples.add(new Person("Paulo", 24));
        listPeoples.add(new Person("Fernanda", 40));
        listPeoples.add(new Person("Amanda", 21));

        //Collections.sort precisa de uma Classe que implemente Comparable
      //  Collections.sort(listPeoples);

        for (var p: listPeoples) {
            System.out.printf("==> %s \n", p);
        }
        System.out.println("____________________________________________");

        //Person implementou Comparable, sobrescreveu o método compareTo

        //E para ordenar por Nome agora: Tenho que usar o Comparator, pq Comparable ja foi usado para idade
        //O jeito antigo seria criar uma classe e implementar Comparator

        Collections.sort(listPeoples, new PersonNameimpl());
        //ou listPeoples.sort(new PersonNameimpl());

        for (var p: listPeoples) {
            System.out.printf("==> %s \n", p);
        }

        //Outra forma que funciona
        listPeoples.sort((new PersonNameimpl());
    }
}
