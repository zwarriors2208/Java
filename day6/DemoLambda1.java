package day6;
import java.util.*;

public class DemoLambda1 {
    public boolean operateOnNum(Predicate p, int n)
    {
        return p.test(n);
    }
    public List<Integer> operateOnNum(Predicate p, List <Integer> n)
    {
     List<Integer> filtered = new ArrayList<>();
     for (Integer i : n)
     {
         if (p.test(i))
         {
             filtered.add(i);
         }
     }
     return filtered;
    }
    public static void main(String[] args) {
        Integer [] nums={12,-13,-14,15,-16,17,18,100,200};
        List<Integer> vals=Arrays.asList(nums);
        DemoLambda1 demo= new DemoLambda1();
        boolean ispositive= demo.operateOnNum((n)-> n>0, 12);
        System.out.println(ispositive);

        List<Integer> positives = demo.operateOnNum((n)-> n>0, vals);
        System.out.println(positives);

        List<Integer> multipleOf100 = demo.operateOnNum((n)-> n%100 == 0, vals);
        System.out.println(multipleOf100);
    }
}