package day2;
import java.util.*;

import com.sun.source.util.SourcePositions;

public class Sort {
    public static void Sort(int[] n){
        for(int i=0;i<n.length;i++){
            for(int j=0;j<i+1;j++){
                if(n[i]<n[j]){
                    int temp=n[j];
                    n[j] = n[i];
                    n[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {1,4,8,23,6};
        Sort(num);
//        for(int i:num){
//            System.out.println(i);
//        }
        System.out.println("After Sorting"+ Arrays.toString(num));
    }
}
