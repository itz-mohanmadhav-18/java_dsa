package java_basics.Arrays;
import java.util.*;

public class FindTheMissingNumber {

    public static void main(String[] args) {

        int arr[] = {0,1,2,3,4,5,6,8,9,10,11,12};

        int len = arr.length;
        int sum = arr[len-1]*(arr[len-1]+1)/2;
        int arrSum = 0;
        for(int x: arr){
            arrSum += x;
        }
        

        System.out.println("the missing number is : "+(sum-arrSum));
        
    }
    
}
