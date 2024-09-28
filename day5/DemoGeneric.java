package day5;

public class DemoGeneric <T>{
    T data;
    public DemoGeneric(T data) {
        this.data = data;
    }
    public String getClassName(){
        return data.getClass().getName();
    }

    public static void main(String[] args) {
        DemoGeneric<Integer> sdfobj = new DemoGeneric<Integer>(1123);
        System.out.println(sdfobj.getClassName());


        DemoGeneric<String> sdfobj2 = new DemoGeneric<String>("Hello World");
        System.out.println(sdfobj2.getClassName());

//        DemoGeneric obj = new DemoGeneric(98687);
//        System.out.println(obj.getClassName());
    }

}
