
import java.util.ArrayList;



public class letterCombination {
    public static void main(String[] args) {
        ArrayList<String> comb= padret("" , "12" , new ArrayList<>()); 
        System.out.println(comb);
    }



    public static ArrayList<String> padret(String p , String up , ArrayList<String> list){
      if(up.isEmpty()){
         list.add(p);
         return list;
      }

      int digit = up.charAt(0) - '0'; //converts '2' to 2

      for (int i = (digit-1)*3 ; i<digit * 3 ; i++){
         char ch = (char) ('a' + i);
         padret(p + ch, up.substring(1) , list);

      }
      return list;

 }
}
