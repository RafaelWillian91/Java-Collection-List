package exercise02Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee {

    public enum Status{
        ACTIVE(1), INACTIVE(0);

        private int opcao;
        Status(int y){
            opcao = y;
        }
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
        List<Employee> listActive = list;

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
