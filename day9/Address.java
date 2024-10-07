package day9;

public class Address{
        String city;

        Address(String city) {
            this.city = city;
        }
    }

    class Person implements Cloneable {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        // Implementing shallow copy
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
