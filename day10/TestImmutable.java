package day10;

import day1.Date;

import java.util.ArrayList;


public class TestImmutable {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        Date mdate = new Date(10,"Dec", 2020);
        Car giddi = new Car("Honda","Civic", mdate, colors );
        System.out.println(giddi);
        colors.add("black");
        System.out.println("the color list: "+ colors);
        mdate.setDay(12);
        System.out.println(giddi);
        System.out.println(giddi.getMandate());
        System.out.println(giddi.getColors());
    }
}
