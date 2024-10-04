package day7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntegerStream {
    public static void main(String[] args) {
        Integer[] nums = {12, 4, 7, 10, 23, 18, 12, 17, 49, 69, 67, 54, 15, 2,2000};
        List<Integer> lst = Arrays.asList(nums);
        System.out.println("---------------------------------------------------");
        Stream<Integer> stream = lst.parallelStream(); //parallel stream
        stream.map((n) -> Math.sqrt(n)).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        stream = lst.parallelStream();
        List<Integer> primes = stream.filter(day2.Math::isPrime).collect(Collectors.toList());
        System.out.println(primes);
        System.out.println("==========================================================");

        stream = lst.stream(); //359 with parallel strema and same with stram becasue f:n is stateless
        Optional<Integer> total = stream.reduce((n1, n2) -> n1 + n2);
        if (total.isPresent())
            System.out.println(total.get());

        stream = lst.parallelStream();
        long sum = stream.reduce(1, (n1, n2) -> n1 + n2);
        System.out.println(sum);

        System.out.println("----------------------------------------------------------");

        stream = lst.parallelStream();
        Optional<Integer> min = stream.min(Integer::compareTo);
        if (min.isPresent())
            System.out.println(min.get());

        stream = lst.stream();
        OptionalDouble ave = stream.mapToDouble(Double::valueOf).average();
        if (ave.isPresent())
            System.out.println(ave.getAsDouble());

//        stream = lst.stream();
//        System.out.println(stream.anyMatch(n->n%100==0));
//        System.out.println(stream.findAny(n->n%2==0));

    }
}

