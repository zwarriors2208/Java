package day9;

public class Counter {
    int count = 0;
    char [] greeting = {'G', 'o', 'o', 'd',' ', 'M', 'o', 'r', 'n', 'i', 'n', 'g', '!'};

    public void increment(){
        count++;

    }

    public int getCount(){
        return count;
    }

    public int getGreetingLength(){
        return greeting.length;
    }

    public void printArray(){
        System.out.print(greeting[count]);
    }
}
