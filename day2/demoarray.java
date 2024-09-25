package day2;

import day1.*;

public class demoarray {
    public static void main(String[] args) {
        int arr[] = {12, 13, 14 , 15, 16};
        for(int i : arr){
            if(i%2 == 0){
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
            }
        }

        Date dd[] = new Date[3];
        dd[0] = new Date();
        dd[1] = new Date();
        dd[2] = new Date();
        dd[0].setDate(12,"sep", 2002);
        dd[1].setDate(25,"sep", 2021);
        dd[2].setDate(21,"sep", 2921);
//        dd[0].diplayDate();
//        dd[1].diplayDate();
//        dd[2].diplayDate();
        for(Date d : dd){
            d.diplayDate();
        }
    }
}
