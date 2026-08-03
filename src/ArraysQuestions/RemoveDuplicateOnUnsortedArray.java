package ArraysQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateOnUnsortedArray {
    public static int[] removeDuplicate(int[] arr) {
        if(arr == null || arr.length ==0){
            return arr;
        }

        Set<Integer> set = new LinkedHashSet<>();

        for(int num : arr){
            set.add(num);
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int [] arr = {10,6,8,7,5,5,8,6,9,99,6,1,455,99,0};
        int [] uniqueArr = removeDuplicate(arr);
        System.out.println(Arrays.toString(uniqueArr));
    }
}
