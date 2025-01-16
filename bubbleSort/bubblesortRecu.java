import java.util.Arrays;

public class bubblesortRecu {
    public static void main (String[] args){
int[] arr = {1,4,2,5,3};
bubbleSort(arr, arr.length -1, 0);
System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int r , int c){
        if(r == 0){
            return;
        }

        if(c<r){
            swap( arr, r,c);
            bubbleSort( arr ,r,c+1);
        }
        else{
            bubbleSort( arr, r-1, 0);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
