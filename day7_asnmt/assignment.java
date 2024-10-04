package day7_asnmt;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class assignment {
    public static void main(String[] args) {
        String []fruit = {"Mango", "Orange", "grapes", "APPLE", "banana", "STRAWBERRY", "Watermelon"};
        List<String> fruits = Arrays.asList(fruit);
        Stream<String> stream = fruits.stream();

        List<String> upper_fruits = stream.map((n)->n.toUpperCase()).collect(Collectors.toList());

        stream = fruits.parallelStream();
//        List<String> lower_fruits = stream.map((n)->n.toLowerCase()).collect(Collectors.toList());
        List<String> lower_fruits = stream.map(String::toLowerCase).collect(Collectors.toList());


//        creating a list of fruits which are less than "n" in ascending order
        System.out.println("-----------------------------fruits less than 'n' in ascending order---------------------------");
        stream = fruits.stream();
        List<String> less = stream.filter((n)->n.toLowerCase().charAt(0) < 'n').sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        System.out.println(less);

        System.out.println("-----------------------------fruits greater than 'n' in ascending order---------------------------");
//        List<String> less_d = less;
//        Collections.sort(less_d, new NameComparator());
        stream = less.stream();
//        List<String> less_d = stream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> less_d = stream.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList());


        System.out.println(less_d);

        System.out.println("--------------------------fruits with uppercase names-----------------------");
        stream = fruits.stream();
//        List<String> upper_default = stream.filter((n)->{
//            for(char c:n.toCharArray())
//            {
//                if(!(Character.isUpperCase(c)))
//                    return false;
//
//            }
//                    return true;
//        }).collect(Collectors.toList());
        List<String> upper_default = stream.filter((n)->n.chars().allMatch(Character::isUpperCase)).collect(Collectors.toList());

        System.out.println(upper_default);

        System.out.println("--------------------------------fruits with 6 alphabets or more");
        stream = fruits.stream();
        List<String> six = stream.filter((n)->n.length()<=6).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        stream.limit(6).collect(Collectors.toList());
        System.out.println(six);


        System.out.println("------------------------fruits starting with uppercase---------");
        stream = fruits.stream();
        stream.filter((n)->Character.isUpperCase(n.charAt(0))).forEach(System.out::println);


    }
}
