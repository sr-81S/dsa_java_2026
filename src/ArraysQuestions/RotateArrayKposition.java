package ArraysQuestions;

import java.util.Arrays;

public class RotateArrayKposition {

    public static void rotateArray(int[] arr, int k){
        k = k % arr.length;
        if(k == 0) return;

        rotate(arr,0, k-1);
        rotate(arr, k, arr.length-1);
        rotate(arr, 0, arr.length-1);

    }

    public static void rotate(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
