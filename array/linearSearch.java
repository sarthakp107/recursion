
import java.util.ArrayList;
import java.util.List;


// [3,2,1,18,9]
//search 18
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
       
        System.out.println(search(arr, 0, 18));

    }
    // ArrayList<Integer> list = new ArrayList<>();
    public static int search(int[] arr, int index , int target){
        //arr, index+1
        //bc: index+ 1 = nums.length return 0;

        if(arr[index] == arr.length){
            return  -1;
        }

        if(arr[index] == target){
            return index;
        }

        return search(arr, index+1 , 18);
    }
}
