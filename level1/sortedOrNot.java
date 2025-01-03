import java.util.Arrays;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] nums = {1,2,4,3};
System.out.println(Arrays.toString(sorted(nums)));
    }

    public static int[] sorted(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]) {
                //swap
                swap(nums, i, i+1);
            }
        }
        
        return nums;
    }

    public static void swap (int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}
