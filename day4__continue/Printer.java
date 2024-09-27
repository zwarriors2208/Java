package day4__continue;

import day3.*;

public class Printer
{
    public void printData(Printable p){
        p.print();
    }
    public static void main(String[] args){
        Printer p = new Printer();
        Book b=new Book("Head first Java",900);
        p.printData(b);

        SalariedEmployee e= new SalariedEmployee(21,"jhb",5000);
        p.printData(e);

    }
}
