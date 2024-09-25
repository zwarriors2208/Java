package day2;

import java.util.ArrayList;

public class DemoWrapper {
    public static void main(String[] args) {
        int i=5;
        Integer j=Integer.valueOf(i); //primitive to wrapper
        System.out.println(j);

        int k =j.intValue(); //wrapper to primitive


        //auto boxing
        int a=12;
        Integer b=a;

        //auto unboxing
        int c=b;

        //Parsing
        int x=Integer.parseInt("30");
        Integer y=Integer.parseInt("40");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);

//        ArrayList lst=new ArrayList();
//        int t=10;
//        lst.add(t);


    }

}
