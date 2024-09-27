package day3;
import day4__continue.Printable;
public abstract class Employee implements Printable{
    protected int empid;
    protected String name;

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public abstract double calculateGross();

    public String toString() {
        return "Employee Data : Employee ID: " + empid + ", Name: " + name;
    }
    public void print() {
        System.out.println("Employee Data : Employee ID: " + empid + ", Name: " + name);
    }
}
