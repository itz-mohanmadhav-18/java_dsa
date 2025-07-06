package java_basics.Arrays;

import java.util.ArrayList;

public class linearSearch {

    public static void main(String[] args) {
        int arr[] = { 0, 9, 5, 0, 7, 0, 4, 2, 6, 0, 3 };
        ArrayList<Integer> list = new ArrayList<>();

        int ele = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                list.add(i);
            }
        }

        System.out.println(list.toString());
    }

}
