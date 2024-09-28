package day5;

import day5_asnmt.IdComparator;
import day5_asnmt.NameComparator;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.Map.Entry;

public class EmployeeCollection {

    public List<Employee> initializeEmployeeData()
    {
        List<Employee> emplist = new ArrayList<Employee>();
        Set<String> skills1 = new TreeSet<>();
        skills1.add("Java");
        skills1.add("Python");
        emplist.add(new Employee(567, "aaa", skills1));
        Set<String> skills2 = new TreeSet<>();
        skills2.add("Java");
        skills2.add("CPP");
        emplist.add(new Employee(123, "sss", skills2));
        Set<String> skills3 = new TreeSet<>();
        skills3.add("Css");
        skills3.add("JavaScript");
        emplist.add(new Employee(890, "Ankit", skills3));
        Set<String> skills4 = new TreeSet<>();
        skills4.add("C#");
        skills4.add("Python");
        emplist.add(new Employee(334, "mmm", skills4));
        return emplist;


    }

    public void printlist(List<Employee> emplist)
    {
        for(Employee e: emplist){
            System.out.println(e);
        }
    }

    public  Employee searchEmployee(List<Employee> emplist,int empid)// in case of filter opertation we will take list of employee in methods and then add them in result because the input will also be array
    {
        for (Employee e : emplist) {
            if (e.getEmpid() == empid)
            {
                return e;
            }
        }
        return null;
    }
    public List<Employee> filterEmployee(List<Employee> emplist, String criteria){
        List<Employee> filtered = new ArrayList<>();
        for (Employee e : emplist) {
            if (e.getSkillset().contains(criteria))
            {
                filtered.add(e);
            }
        }
        return filtered;
    }
    public Map<Integer,String> nameMap(List<Employee> emplist)
    {
        Map<Integer,String> salmap= new TreeMap<>();
        for(Employee e: emplist)
        {
            salmap.put(e.getEmpid(),e.getName());
        }
        return salmap;
    }


    public static void main(String[] args) {
        EmployeeCollection e = new EmployeeCollection();
        List<Employee> emplist = e.initializeEmployeeData();
        e.printlist(emplist);
        System.out.println("_------------------------------------------------------------------------");
        System.out.println(e.searchEmployee(emplist,890));
//        e.searchEmployee(emplist,890);
        System.out.println("_------------------------------------------------------------------------");

//        System.out.println(e.filterEmployee(emplist, "Python"));
        List<Employee> d = e.filterEmployee(emplist, "Python");
        for(Employee e1: d){
            System.out.println(e1);
        }

        System.out.println("_------------------------------------------------------------------------");
        Map<Integer, String> dicts =   e.nameMap(emplist);
        Set<Entry<Integer, String>> set1 = dicts.entrySet();
        for(Entry<Integer, String> e2: set1){
            System.out.println(e2.getKey()+":"+e2.getValue());
        }


        System.out.println("_--------------sorting by idd---------------------------------------------------");

        Collections.sort(emplist);
        e.printlist(emplist);

        System.out.println("---------------------Sort by name-------------------");
        Collections.sort(emplist, new NameComparator());
        e.printlist(emplist);

        System.out.println("---------------------Sort employee id-----------");
        Collections.sort(emplist, new IdComparator());
        e.printlist(emplist);

        System.out.println("-------------------binary search-----------------------------------");
        int i = Collections.binarySearch(emplist, new Employee(567, null, null));
        System.out.println("the index is"+i);

        System.out.println("Minimum ID");
        System.out.println(Collections.min(emplist, new IdComparator()));

        System.out.println("Maximum ID");
        System.out.println(Collections.max(emplist, new IdComparator()));
        System.out.println("-=0------------------------------------------------------------------------");
        Collections.reverse(emplist);
        e.printlist(emplist);

    }


}
