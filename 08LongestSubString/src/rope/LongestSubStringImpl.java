package rope;

import java.util.HashSet;

public class LongestSubStringImpl {

    public int getLongestSubStr(String str){
        int maxLength = 0;
        HashSet<Character> hsSet = new HashSet<>();
        int i = 0, j = 0;
        while ( j < str.length()){
            if(!hsSet.contains(str.charAt(j))){
                hsSet.add(str.charAt(j));
                j++;
                maxLength = Integer.max(maxLength,j-i);
            }else{
                hsSet.remove(str.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public int getLongestSubStrTwo(String str){
        boolean[] chars = new boolean[256];

        int j = 0, i = 0, maxLength = 0;

        if(str == null || str.length() < 2){
            return Integer.MIN_VALUE;
        }

        while( j < str.length()) {
            if (!chars[str.charAt(j)]){
                chars[str.charAt(j)] = true;
                j++;
            }else{
                chars[str.charAt(j)] = false;
                i++;
            }

            maxLength = Math.max(maxLength,j-i);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        LongestSubStringImpl impl = new LongestSubStringImpl();
        int maxCount = impl.getLongestSubStrTwo("abbcca" +
                "" +
                "");
        System.out.println("Longest subString is : " + maxCount);
    }
}
