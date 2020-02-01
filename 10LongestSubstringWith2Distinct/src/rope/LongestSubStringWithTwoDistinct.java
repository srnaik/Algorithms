package rope;

public class LongestSubStringWithTwoDistinct {

    public int lengthOfSubStringWithTwoDistinct(String s) {

        int[] count = new int[256];
        int i = 0, numDistinct = 0, maxLen = 0,strLength = s.length(), j = 0;
        while (j < strLength){
            if (count[s.charAt(j)] == 0) numDistinct++;
            count[s.charAt(j)]++;
            while (numDistinct > 2) {
                count[s.charAt(i)]--;
                if (count[s.charAt(i)] == 0) numDistinct--;
                i++;
            }
            j++;
            maxLen = Math.max(j - i, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubStringWithTwoDistinct ls = new LongestSubStringWithTwoDistinct();
        int length = ls.lengthOfSubStringWithTwoDistinct("ecececcbae");
        System.out.println("Longest SubString Length is: " + length);
    }
}
