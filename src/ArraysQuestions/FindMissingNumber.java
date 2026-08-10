package ArraysQuestions;

public class FindMissingNumber {

    // its for 1 number missing in array
    public static int findMissingNumber(int[] arr) {
        if(arr == null || arr.length == 1) return 0;
        int n = arr.length +1;
        int actualSum = n* (n+1)/2;
        int sum =0;
        for(int num:arr){
            sum = sum+num;
        }
        return  actualSum - sum;
    }

    // for multiple missing numbers

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7};
        System.out.println(findMissingNumber(arr));
    }
}
