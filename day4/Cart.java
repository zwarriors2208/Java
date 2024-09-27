package day4;

public class Cart {
    public double addToCart(Dessert []d) {
        double price = 0;
        for( Dessert d1 : d) {
            price += d1.calculatePrice();
            System.out.println(d1.details());

        }
        return price;
    }
}
