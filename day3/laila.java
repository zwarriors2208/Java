package day3;

import org.w3c.dom.ls.LSOutput;

public class laila {
    public static void main(String[] args) {
        String n1 = new String("Hello");
        String n2 = new String("Hello");
        if(n1.equals(n2)) {
            System.out.println(n1 + n2);
        }
        String a = "lala";
        String b = "lala";

        if(n1.hashCode() == n2.hashCode()) {
            System.out.println("yes");
        }

        if(a.equals(b)){
            System.out.println("yes");
        }
    }
}
