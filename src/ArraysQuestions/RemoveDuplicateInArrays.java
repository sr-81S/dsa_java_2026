package ArraysQuestions;

import java.util.Arrays;

public class RemoveDuplicateInArrays {

    static int[] removeDuplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        if (arr.length == 1) {
            return new int[]{arr[0]};
        }

        Arrays.sort(arr);
        int[] result = new int[1];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = arr[i];
            }
        }
        return result;
    }

    static int[] findDuplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        if(arr.length ==1){
            return arr;
        }

        Arrays.sort(arr);

        int index = 0;

        for(int i =1; i< arr.length; i++){
            if(arr[i] != arr[index]){
                index++;
                arr[index] = arr[i];
            }
        }
        return Arrays.copyOf(arr, index + 1);
    }

    public static void main(String[] args) {
        int [] arr = {10,6,8,7,5,5,8,6,9,99,6,1,455,99,0};
        int[] uniqueElements = removeDuplicate(arr);
        int[] uniqueElements2 = findDuplicate(arr);
        System.out.println(Arrays.toString(uniqueElements));
        System.out.println(Arrays.toString(uniqueElements2));
    }
}
