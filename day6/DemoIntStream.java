package day6;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
    public static void main(String[] args) {
        int[] nums={12,4,7,10,23,18,13,26,17,2,24,15,55,54,34,78};
        IntStream stream= Arrays.stream(nums);

        System.out.println(stream.count()); //terminal operation
        stream=Arrays.stream(nums);
        System.out.println(stream.distinct().sorted().count());

        stream=Arrays.stream(nums);
//        stream.distinct().sorted().forEach((n) -> System.out.println(n));

        stream.distinct().sorted().forEach(System.out::println); //Each element in a sorted order

        stream=Arrays.stream(nums);
        List<Integer> squares=stream.map((n) -> n*n).boxed().collect(Collectors.toList());
        System.out.println(squares);

        stream=Arrays.stream(nums);
        List<Integer> even = stream.filter((n)-> n%2==0).boxed().collect(Collectors.toList());
        System.out.println(even);
    }
}
