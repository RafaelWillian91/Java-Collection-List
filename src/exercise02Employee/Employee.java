package exercise02Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee {

    public enum Status{
        ACTIVE, INACTIVE;

    }
    private String name;
    private Status status;

    public Employee (String name, Status s){
        this.name = name;
        this.status = s;
    }
    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public static List<Employee> removeEmployee(List<Employee> list, Status s){
        //Criada uma nova lista para não alterar a lista original
        //List<Employee> listActive = list;//Dessa forma ao alterar a listActive ela altera a list original.
        //Para isso nao acontecer, populamos a lista de outra forma
        var listActive = new ArrayList<Employee>();
        listActive.addAll(list);

        Iterator iterator = listActive.iterator();

        while (iterator.hasNext()){

            Employee employee = (Employee) iterator.next();

            if(employee.getStatus() == s){
                iterator.remove();
            }
        }
        return listActive;
    }

}
