public class mergeS{
    public static void main(String[] args) {
        
    }

    public static void mergeSortInPlace(int[] arr, int s , int e){
        if(e-s == 1){
            return;
        }
        int m = s+ (e-s) /2;

        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);

        merge(arr, s , m , e);

    }

    static void merge(int[] arr, int s, int m, int e){
        
    }
}