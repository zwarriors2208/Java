package day6_snmt2;

import java.util.Comparator;

public class NameComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
