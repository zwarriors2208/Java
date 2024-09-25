package day2;
import day1.Date;

import day1.DateGetter;
public class Math {
    /*parameters in java are passed by value:only a copy of variable data is passed from calling method to called method,
     not the actual data.
     When an array/reference variable is passed it passes copy of reference to the called method,
     not the actual object
    */
    public static int increment(int num){
        return ++num;
    }
    public static void incrementDate(DateGetter d){
        int d1 = d.getDay();
        d.setDay(d1+1);
    }
    public static void swapDates(Date d1, Date d2)
    {
        Date temp=null;
        temp=d1;
        d1=d2;
        d2=temp;
        //here swapping the dates will not work as we are giving the copy of references and we are just swapping them here so it will not swap in main method as references are stored in stack
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("before increment: " + n);
        n = increment(n);
        System.out.println("after increment: " + n);

        DateGetter d = new DateGetter();
        d.setDay(21);
        d.setMonth("dec");
        d.setYear(2020);
        System.out.println("before increment: " + d);

        incrementDate(d);
        System.out.println("after increment: " + d);

        Date dt1= new Date();
        dt1.setDate(4,"Dec",1990);
        Date dt2= new Date();
        dt2.setDate(4,"Dec",2000);
        System.out.println("before swap: " + dt1+" d2:"+dt2);
        swapDates(dt1,dt2);
        System.out.println("after swap: " + dt1+" d2:"+dt2);


    }
}
