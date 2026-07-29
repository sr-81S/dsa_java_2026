package ArraysQuestions;

import java.util.Arrays;

public class FindLargeNumber {

    //classic solution
    static int findLargeNumber(int[] arr) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //for the sorted array

    static int findLargeNumber2(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }

    //sorting the data through Stream

    static int findLargeNumber3(int[] arr) {
        return Arrays.stream(arr).parallel().max().orElse(-1);
    }


    public static void main(String[] args) {
        int [] arr = {10,6,8,7,5,6,1,455,99,0};
        System.out.println(findLargeNumber(arr));
        //System.out.println(findLargeNumber2(arr));
        System.out.println(findLargeNumber3(arr));
        System.out.println(Arrays.toString(arr));
    }
}
