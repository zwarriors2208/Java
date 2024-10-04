package day6;

public class DemoGeneric <T extends Number>{
    T[] num;
    public void setValues(T[] num)
    {
        this.num = num;
    }
    public double getAverage()
    {
        double sum=0.0;
        for (int i =0;i<num.length;i++)
        {
            sum+=num[i].doubleValue();
        }
        return sum/num.length;
    }
    public static void main (String[] args){
        Integer [] arr={12,14,16,76,89,97};
        DemoGeneric<Integer> stat1= new DemoGeneric<>();
        stat1.setValues(arr);
        System.out.println(stat1.getAverage());
        DemoGeneric<Double> stat2 = new DemoGeneric<>();
        Double [] arr2={23.8,14.90,16.98,76.09,89.09,97.098};
        stat2.setValues(arr2);
        System.out.println(stat2.getAverage());
        Double []arr3 = new Double[arr.length];
        for(int i =0; i < arr.length;i ++){
            arr3[i] = arr[i].doubleValue();
        }
        stat2.setValues(arr3);
        System.out.println(stat2.getAverage());
    }
}
