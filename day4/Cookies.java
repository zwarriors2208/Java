package day4;

public class Cookies extends Dessert{
    public Cookies(double p, String f, int Quantity) {
        super(p,f, Quantity);
    }

    public String details(){
        return "COOKIES--->"+ super.details()+"per Dozen";
    }

    @Override
    public double calculatePrice() {
        return price * quantity / 12;
    }

}
