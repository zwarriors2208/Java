package day1;

public class DateGetter {

    private int day;
    private String month;
    private int year;

    public void setDay(int day)
    {
        if(day<0)
            System.out.println("Invalid Input");

        else
            this.day=day;

    }
    public void setMonth(String month)
    {

            this.month=month;

    }
    public void setYear(int year)
    {
        if(year<0)
            System.out.println("Invalid Input");

        else
            this.year=year;

    }
    public int getDay()
    {
        return day;
    }
    public String getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }
    //overridden method toString()
    public String toString()
    {
        return day+"/"+month+"/"+year;
    }

    public static void main(String[] args) {
        DateGetter dg = new DateGetter();
        dg.setDay(987);
        System.out.println(dg.getDay());
    }


}
