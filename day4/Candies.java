package day4;

public class Candies extends Dessert{

    public Candies(double p,String f, int quantity) {
        super(p, f, quantity);
    }
    public String details(){
        return "CANDIES--->"+ super.details()+"per kg";
    }
    @Override
    public double calculatePrice() {
        return price*quantity/1000;
    }
}
