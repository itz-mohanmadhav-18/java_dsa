package java_basics.Arrays;

public class rotateArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] temp = arr.clone();
        int k = 3;
        k = k%arr.length;
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = temp[(i+k)%arr.length];
        // }

        
        rotate(arr, 0, k-1);
        rotate(arr, k, arr.length-1);
        rotate(arr, 0, arr.length-1);
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void rotate(int[] arr , int i , int j){

        for(;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

}
