package java_basics.Sorting;

import java.util.Scanner;

public class bubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Start entering elements : ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        bubble_Sort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }

    /*
     * Tc : On(n^2) in all cases;
     */

    public static void bubble_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
