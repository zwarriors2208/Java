package day5_asnmt;

import day5.Employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
