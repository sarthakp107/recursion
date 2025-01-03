

public class sorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4};
        System.out.println(sorted(nums, 0));
    }

    public static boolean sorted(int[] nums , int index){
       //base condition 
       if(index == nums.length-1){
        return true;
       }
        return nums[index] < nums[index+1] && sorted(nums, index +1);
    }
}
