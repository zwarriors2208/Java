package day6;
import day1.*;

public class GenericLambda {
    public static <T> T operateOnData(Function <T> f,T data)
    {
        return f.apply(data);
    }
    public static void main(String[] args) {
        String substring= operateOnData((s) -> s.substring(3),"Java 11");
        System.out.println(substring);

        Integer square= operateOnData((n) -> n*n,24);
        System.out.println(square);
    }
}
