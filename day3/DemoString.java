package day3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DemoString {
    public static void main(String[] args) {
        String s ="Java";
        String s1 = "Java";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        //s=s+"11";
        //System.out.println(s.hashCode());

        String n1=new String("hello");
        String n2=new String("hello");

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        if(s==s1)
            System.out.println("Strings are equal");

        if(n1.equals(n2))
            System.out.println("Strings are equal");

        System.out.println(n1+n2);
    }
}
