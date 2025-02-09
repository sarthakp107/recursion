
import java.util.ArrayList;


public class subsetArrayList {
    public static void main(String[] args) {
        ArrayList<String> result = subset("", "abc");
        System.out.println(result);
    }

    public static ArrayList<String> subset(String p, String up){
        ArrayList<String> result = new ArrayList<>();

        if(up.isEmpty()){
            result.add(p);
            return result;
        }

        char ch = up.charAt(0);

        ArrayList<String> include = subset(p + ch, up.substring(1));
        result.addAll(include);
        ArrayList<String> exclude = subset(p, up.substring(1));
        result.addAll(exclude);

        return result;
    } 
}
