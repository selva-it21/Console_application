// Even positions Should be in descending order arranged and odd positions should be in the
// ascending order arranged.

import java.util.Arrays;

public class Sorting {
    public static int[] sorting(int[] arr){
        int[] sorted = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
            if(idx < arr.length/2)
                sorted[idx++] = arr[arr.length-idx-1];
        }
        System.out.println(Arrays.toString(sorted));
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {34 ,6, 2 ,4 ,12 ,8 ,9, 1 ,23};
        // even 34 2 12 9 23 =>34 23 12 9 2
        //odd 6 4 8 1 => 1 4 6 8
        //output 34 1 23 2 12 4 9 6 8
        System.out.println(Arrays.toString(sorting(arr)));
        // System.out.println(Arrays.toString(sorting(arr)));
    }
}
