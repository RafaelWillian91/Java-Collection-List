package exercise02Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static exercise02Employee.Employee.Status.ACTIVE;
import static exercise02Employee.Employee.Status.INACTIVE;
public class Listaexercise02 {

    public static void main(String[] args) {

        var listEmployee = new ArrayList<Employee>();
        listEmployee.add(new Employee("Rafael Willian", ACTIVE));
        listEmployee.add(new Employee("Barbara Muniz", ACTIVE));
        listEmployee.add(new Employee("Lourenco Dias", INACTIVE));
        listEmployee.add(new Employee("Rodrigo Coelho", ACTIVE));
        listEmployee.add(new Employee("Bartolomeu Rodrigues", INACTIVE));
        listEmployee.add(new Employee("Cassia Godoy", INACTIVE));

        Iterator l = listEmployee.iterator();

        while (l.hasNext()){
            System.out.println(l.next());
        }

        System.out.println("-------------------------------------------------");
        Employee.removeEmployee(listEmployee, INACTIVE);
        for (Employee e : listEmployee) {
            System.out.println(e);
        }


    }
}
