package OrdenandoListasObjetosClassesCustomizadas;

public class Person implements Comparable <Person> {

    private final String name;
    private int idade;

    public Person(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return -Integer.compare(o.getIdade(), this.idade);
    }
}
