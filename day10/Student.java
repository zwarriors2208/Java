package day10;

public class Student {
    private int rollno;
    private String name;

    private Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    };

    public Student()
    {
        rollno=100;
        name="ppp";
    }

    private void privateMethod(){
        System.out.println("This is a private method");
    }
    public static void staticMethod(){
        System.out.println("This is a static method");
    }
    @CreatedBy(priority = 1,createdBy = "aaaa")
    public void displayData(){
        System.out.println(rollno+" "+name);
    }
    public void methodWithParam(int rollno, String name)
    {
        this.name=name;
        this.rollno=rollno;
        System.out.println("Roll no set to: "+ rollno);
    }

//    public static void main(String[] args) {
//        Student ankit = new Student(101,"Ankit");
//        ankit.displayData();
//    }

}
