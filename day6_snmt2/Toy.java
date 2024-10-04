package day6_snmt2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import jdk.jfr.Category;

public class Toy implements Comparable<Toy>{
    int product_id;
    String name;
    Double price;
    int age;
//    int purchase_year;
    LocalDate purchase_year;
    String category;
    //considering that we would enter date in the format "dd/mm/yyyy"
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Toy(int product_id, String name, Double price, int age, String purchase_year, String Category) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.age = age;
        try {
            this.purchase_year = LocalDate.parse(purchase_year, formatter);
        }
        catch (DateTimeParseException e) {
            this.purchase_year = LocalDate.of(2024,9,30);
//                this.purchase_year = LocalDate.now();
        }
        this.category = Category;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getPurchase_year() {
        return purchase_year;
    }

//    public void setPurchase_year(int purchase_year) {
//        this.purchase_year = purchase_year;
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public String toString() {
//        return "name=" + name + ", price=" + price + "$, age=" + age + ", purchase_year=" + purchase_year + ", category=" + category;
//    }

    public String toString() {
        return String.format(
                "Name: %-30s | Price: %-8.2f | Age: %-2d | Purchase Year: %-12s | Category: %-15s",
                name, price, age, purchase_year, category
        );
    }


    @Override
    public int compareTo(Toy o) {
        return this.product_id - o.product_id;
    }
}
