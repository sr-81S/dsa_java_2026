package ArraysQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {

    public static List<Integer> findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return list;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num) && !list.contains(num) ){
                list.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 10};
        List<Integer> duplicates = findDuplicate(nums);
        System.out.println(duplicates);
    }

}
