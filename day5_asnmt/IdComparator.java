package day5_asnmt;

import day5.Employee;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmpid()>o2.getEmpid())
            return 1;
        else
            return -1;
    }
}
