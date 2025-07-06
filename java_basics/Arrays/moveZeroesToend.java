package java_basics.Arrays;

import java.util.Arrays;

public class moveZeroesToend {

    public static void main(String[] args) {
        int[] arr = {0, 9 , 5 ,0, 7 , 0 , 4 , 2 , 6 , 0 ,3};
        int idx = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]!=0){
                arr[idx++] = arr[i];
            }
        }
        Arrays.fill(arr,idx,arr.length,0);


        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    
}
