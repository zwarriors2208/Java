package day1;

public class Students {
    String name;
    int roll_no;
    static int c=1;
    public Students(String name) {
        this.name = name;
        this.roll_no = c;
        c += 1;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + roll_no;
    }

    public static void main(String[] args) {
        Students s1 = new Students("Michael");
        Students s2 = new Students("Ankit");
        Students s3 = new Students("Adarsh");
        Students s4 = new Students("Alex");
        Students s5 = new Students("Ashu");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
