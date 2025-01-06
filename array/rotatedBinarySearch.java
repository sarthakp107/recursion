public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
    }
/*  s     m        e
 * [5,6,7,8,9,1,2,3]
 *  0,1,2,3,4,5,6,7
 * 
 * target = 7;
 * 
 * 1) m ==target
 * 2) s < m : numbers till s-m are sorted
 *  2.1) check till m-1;
 * 
 */

    public static int binarySearchForRotated(int[] arr, int target , int start , int end){
        while(start<=end){
            int mid = start+ (end - start)/2;

            //first case: 
            if(target == arr[mid]) {
                return mid;
            }

            //case 2:
            if(arr[start] < arr[mid]){
                //it is sorted
                binarySearchForRotated(arr, target, start, mid-1);
            }
            
        }
    }
}
