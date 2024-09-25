package day2;
import day1.Date;
public class Car {
    private String make;
    private String model;
    private Date year;
    public Car(String make, String model, Date year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return make + " " + model + " " + year;
    }

    public static void main(String[] args) {
        Car car = new Car("honda", "City", new Date(1,"Mar",2022));
        System.out.println(car);
    }
}
