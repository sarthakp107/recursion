//revise this ASAP
import java.util.ArrayList;

//arr = {1,2,3,4,5,4}
//target = 4;
//output = [3,5];


public class arrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4};
        // System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    public static ArrayList<Integer> findAllIndex(int[]arr, int target, int index, ArrayList<Integer> list){
        //base condition
        if(index == arr.length){
            return list;
        }

        // different reference varaible pointing to the same object
        if(arr[index] == target){
             list.add(index);
        }
       return findAllIndex(arr, target, index + 1, list);

    }


    //
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        
        ArrayList<Integer> list = new ArrayList<>();
        //base
        if(index == arr.length){
            return list;
        }


        //only this will contain the ans for that function call ............≥≤≥≤≥≤≥ 
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
