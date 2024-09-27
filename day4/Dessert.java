package day4;

public abstract class Dessert {
    protected double price;
    protected int quantity;
    String flavour;
    public Dessert(double p, String f, int quantity) {
        price = p;
        flavour = f;
        this.quantity = quantity;
    }

    public String details() {
        return "Flavour:"+flavour+", Price:"+price+"$ ";
    }
    public abstract double calculatePrice();
}
