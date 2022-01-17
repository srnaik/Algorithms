import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public int lengthOfSubString(String str){

        if(str == null || str.isEmpty())
            return 0;

        int i =0, j = 0, maxLength = 0;
        Set<Character> hSet = new HashSet<>();

        while (j < str.length()){
            if(!hSet.contains(str.charAt(j))){
                hSet.add(str.charAt(j));
                j++;
                maxLength = Integer.max(maxLength,j-i);
            }else{
                hSet.remove(str.charAt(i));
                i++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubString longestSubString = new LongestSubString();
        //int index = longestSubString.lengthOfSubString("aaaabc");
        //System.out.println("Length of a longest sub-string without repeating characters "+ index);

        String strHost = "localhost:8080";
        String refHost = "localhost";

        if(strHost.contains(refHost)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
