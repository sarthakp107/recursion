
import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println(dicefnc("", 4));
    }

    public static ArrayList<String> dicefnc(String p, int target){
        if(target == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1 ; i<=target ; i++){
             list.addAll(dicefnc(p + i, target - i));
        }
        return list;
    }
}
