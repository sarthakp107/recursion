

public class subsets1 {
    public static void main(String[] args) {
        subsets("", "abc");
    }

    public static void subsets(String p , String up){
        //p = ""
        //up = "a,b,c"
        //base{ up = 0};

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsets(p + ch, up.substring(1));
        subsets(p, up.substring(1));
    }
}
