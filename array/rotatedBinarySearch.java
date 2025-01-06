public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(binarySearchForRotated(arr, 7, 0, arr.length - 1));
    }


    public static int binarySearchForRotated(int[] arr, int target , int start , int end){
    if(start > end){
        return -1;
    }
    int mid = start + (end - start)/2;

    if( arr[mid] == target){
        return mid;
    }

    if(arr[start] <= arr[mid]){
        if(target >= arr[start] && target <= arr[mid]){
            //end = mid -1;
            return binarySearchForRotated(arr, target, start, mid-1);
        }else{
            binarySearchForRotated(arr, target, mid + 1, end);
        }
    }

    if(target >= arr[mid] && target <= arr[end]){
        return binarySearchForRotated(arr, target, mid + 1, end); 
    }else{
        return binarySearchForRotated(arr, target, mid -1, end);
    }
        
    }
}
