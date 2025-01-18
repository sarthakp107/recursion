
import java.util.Arrays;

public class b1{
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr , int r, int c){
        if(r == 0){
            return;
      
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                swap(arr, c, c+1);
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }
    }


    static void swap(int[] arr, int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}