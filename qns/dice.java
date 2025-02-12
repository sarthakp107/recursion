public class dice {
    public static void main(String[] args) {
        dicefnc("", 4);
    }

    public static void dicefnc(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1 ;  i <= target ; i++ ){
            dicefnc(p + i, target - i);
        }
    }
}
