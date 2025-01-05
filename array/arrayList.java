
import java.util.ArrayList;

//arr = {1,2,3,4,5,4}
//target = 4;
//output = [3,5];


public class arrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4};
        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
    }

    public static ArrayList<Integer> findAllIndex(int[]arr, int target, int index, ArrayList<Integer> list){
        //base condition
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
             list.add(index);
        }
       return findAllIndex(arr, target, index + 1, list);

    }
}
