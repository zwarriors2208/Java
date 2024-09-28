package day5;
import java.util.Map.Entry;
import java.util.*;
public class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",100);
        map.put("two",200);
        map.put("three",300);

        System.out.println(map.get("two"));
        Set<String> keyset=map.keySet();
        for(String key:keyset)
        {
            System.out.println(key+"->"+map.get(key));
        }
        System.out.println("-----------------------");

        Set<Entry<String,Integer>> entries=map.entrySet();
        for(Entry<String,Integer> entry:entries)
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        System.out.println("______________________");
        map.remove("three");
//        keyset = map.keySet();
        for(String key:map.keySet())
        {
            System.out.println(key+"->"+map.get(key));
        }
    }
}
