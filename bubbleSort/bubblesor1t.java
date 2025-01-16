

import java.util.Arrays;

public class bubblesor1t {
    public static void main(String[] args) {
         int[] nums = {3,1,5,4,2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    static void bubbleSort(int[] nums){
        for(int i =0 ; i< nums.length; i++){
            for(int j = 1; j< nums.length - i ;j++ ){
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }
            }
        }
    }

    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
