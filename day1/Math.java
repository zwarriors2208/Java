package day1;

public class Math {
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int n) {

        for (int i =2; i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {
//        Math math = new Math();
        System.out.println(Math.factorial(5));
        System.out.println(Math.isPrime(97));
    }
}
