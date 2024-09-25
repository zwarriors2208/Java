package day1;

public class Account
{
    private int accid;
    private String name;
    private static float intrate = 67f;
    //static blocks are executed before main()
    static
    {
        System.out.println("Static Block1");

    }
    static
    {
        System.out.println("Static Block2");
    }
    public Account()
    {
        //accid=10000;
        //name="aaaaa";
        this(10000,"aaaa");
    }
    public Account(int accid, String name)
    {
        this.accid = accid;
        this.name = name;
    }
    public static void displayInterestRate()
    {
        System.out.println("Current interest rate for account: "+ intrate);
    }

    public void displayDetails(){
        System.out.println("Account ID: "+accid);
    }

}


