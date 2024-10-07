package day9;

public class ShallowCopyExample {
        public static void main(String[] args) throws CloneNotSupportedException {
            Address address = new Address("New York");
            Person person1 = new Person("John", address);

            // Creating a shallow copy of person1
            Person person2 = (Person) person1.clone();

            System.out.println(person1.name + " lives in " + person1.address.city);  // John lives in New York
            System.out.println(person2.name + " lives in " + person2.address.city);  // John lives in New York

            // Modifying person2's address
            person2.address.city = "Los Angeles";

            // Both person1 and person2 are affected by the change
            System.out.println(person1.name + " lives in " + person1.address.city);  // John lives in Los Angeles
            System.out.println(person2.name + " lives in " + person2.address.city);  // John lives in Los Angeles
        }
    }
