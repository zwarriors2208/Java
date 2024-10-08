package day10;
import day1.Date;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Car {
    private final String make;
    private final String model;
    private final Date mandate;
    private final ArrayList<String> colors;
    public Car(String make, String model, Date mandate, ArrayList<String> colors) {
        this.make = make;
        this.model = model;
        this.mandate = mandate.clone();
//        this.mandate=new Date(mandate.getDay(),mandate.getMonth(),mandate.getYear());
//        ArrayList<String> temp = new ArrayList<>();
//        Iterator<String> it = colors.iterator();
//        while(it.hasNext())
//        {
//            temp.add(it.next());
//        }
//        this.colors = temp;
//
        ArrayList<String> temp = new ArrayList<>();
        for(String color: colors)
        {
            temp.add(color);
        }
        this.colors = temp;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Date getMandate() {
        return mandate;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mandate=" + mandate +
                ", colors=" + colors +
                '}';
    }
}
