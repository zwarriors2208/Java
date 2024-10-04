package day7;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {
    public List<Employee> initializeData()
    {
        List<Employee> emplist = new ArrayList<Employee>();
        Set<String> skills1 = new TreeSet<>();
        skills1.add("Java");
        skills1.add("Python");
        emplist.add(new Employee(567, "aaa",7896,  skills1, "IT"));
        Set<String> skills2 = new TreeSet<>();
        skills2.add("Java");
        skills2.add("CPP");
        emplist.add(new Employee(123, "sss", 982674,skills2, "IT"));
        Set<String> skills3 = new TreeSet<>();
        skills3.add("Css");
        skills3.add("JavaScript");
        emplist.add(new Employee(890, "Ankit", 2341,skills3, "Chaiwala"));
        Set<String> skills4 = new TreeSet<>();
        skills4.add("C#");
        skills4.add("Python");
        emplist.add(new Employee(334, "mmm", 123412,skills4, "Modi"));
        return emplist;
    }
    public static void main(String[] args) {
        EmployeeStream e = new EmployeeStream();
        List<Employee> emplist = e.initializeData();
        Stream<Employee> stream = emplist.stream();

        Comparator<Employee> byname = Comparator.comparing(Employee::getName);
        System.out.println("----Sorting by name------");
        stream.sorted(byname).forEach(System.out::println);

        stream = emplist.stream();
        Comparator<Employee> bydept= Comparator.comparing(Employee::getDepartment).thenComparing(byname);
        System.out.println("----Sorting by name for department------");
        stream.sorted(bydept).forEach(System.out::println);

        System.out.println("--------------------------");
        stream=emplist.stream();
        Predicate<Employee> salrange=(emp)->{
            if (emp.getSalary()>=50000 && emp.getSalary()<75000 )
                return true;
            else
                return false;
        };
        stream.filter(salrange).forEach((v)->System.out.println(v));

        System.out.println("---------------------------");
        stream =emplist.stream();
        stream.filter((emp)->emp.getSkillset().contains("Java")).forEach((v)->System.out.println(v));

        System.out.println("---------------------------");
        stream =emplist.stream();
        Map<String, List<Employee>> empsbydept=stream.collect(Collectors.groupingBy(Employee::getDepartment));
        empsbydept.forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println("---------------------------");
        stream =emplist.stream();
        stream.map((emp)->new Department(emp.getEmpid(),emp.getDepartment()));

        System.out.println("---------------------------------------------");
        stream = emplist.stream();
        double totalsal = stream.mapToDouble(Employee::getSalary).reduce(0, (e1, e2)->e1+e2);
        System.out.println(totalsal);



    }


}
