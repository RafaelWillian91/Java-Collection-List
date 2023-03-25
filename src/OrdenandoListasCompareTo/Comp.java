package OrdenandoListasCompareTo;

public class Comp implements Comparable<Integer>{
    @Override
    public int compareTo(Integer o) {
        return Integer.compare(0, 1);
    }
}
