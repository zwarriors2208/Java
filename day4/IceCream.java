package day4;

public class IceCream extends Dessert{
    public IceCream(double p, String f, int quantity) {
        super(p, f, quantity);
    }

    @Override
    public double calculatePrice() {
        return price * quantity;
    }

    public String details() {
        return "ICE CREAM--->"+ super.details()+"per Ice Cream";
    }

}
