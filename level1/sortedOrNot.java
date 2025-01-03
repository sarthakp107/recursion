

//for recursion

/*index = 0
 * [1,2,4,3,6]
 * arr[i] < arr[i+1], index + 1
 * 
 */




public class sortedOrNot {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(isSorted(nums));
    }
    
    public static boolean isSorted(int[] nums){
        for(int i = 0; i< nums.length; i++){
            nums[i] < nums[i+1]
        }

    }


}
