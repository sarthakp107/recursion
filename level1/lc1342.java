public class lc1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    static boolean isEven(int num){
        return (num%2 == 0);
    }
    static int count = 0;
    static int numberOfSteps(int num){
        if(num == 0){
            return 0;
        }
        
        if(isEven(num)){
            count++ ;
            numberOfSteps(num/2);
        }
        else{
            count++;
            numberOfSteps(num-1);
        }
        return count;
    }
}
