package day1;
import day2.span;

import java.util.Scanner;

public class Date{
    private int day;
    private span month;
    private int year;
    public Date(){

    }
    public Date(int d, String m, int y){
        day = d;
//        month = span.valueOf(m.toUpperCase());
        month = span.DEC;
        year = y;
    }
    public void setDate(int d, String m, int y){
        day = d;
//        month = span.valueOf(m.toUpperCase());
        month = span.DEC;
        year = y;
    }

    public void diplayDate(){
        System.out.println("date: "+ day + "/" + month + "/" + year);
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }

}