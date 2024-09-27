package day4__continue;

import java.util.Objects;

public class Car implements Cloneable{
    private String make;
    private String model;
    private int price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }



    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        Car other = (Car) o;
        if(this.make.equals(other.make) && this.model.equals(other.model) && this.price == other.price )
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price);// it will return a unique hash code by complimenting the unique and the unique hashcode will be same in case of same objects which will be not the case if we dont use this
    }


    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Price: " + price;
    }
}
