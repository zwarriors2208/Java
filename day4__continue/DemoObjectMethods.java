package day4__continue;

public class DemoObjectMethods {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("aaa","bbb",1000000);
        Car car2 = new Car("aaa", "bbb", 1000000);
        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode()+ "  " + car2.hashCode());

        Car car3 = (Car)car1.clone();
        car1.setPrice(435);
        System.out.println(car1.equals(car3));
    }
}
