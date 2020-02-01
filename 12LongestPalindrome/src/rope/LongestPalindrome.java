package rope;

public class LongestPalindrome {


    public String longestPalindrome(String s){
        if(s == null || s.isEmpty())
            return "";
        else if(s.length() == 1)
            return s;
        String longest = s.substring(0,1);
        for(int i = 0; i < s.length(); i++){
           String tmp = helper(s, i,i);
           if(tmp.length() > longest.length())
               longest = tmp;
           tmp = helper(s,i,i+1);
           if(tmp.length() > longest.length())
               longest = tmp;
        }
        return longest;
    }


    private String helper(String s, int low, int high){
        while (low >= 0 && high <s.length() && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }
        return s.substring(low+1, high);
    }


    public static void main(String[] args) {
        Object object = new Object();
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String s = longestPalindrome.longestPalindrome("cabbad");
        System.out.println("Longest Palindrome for the given String is : " + s);
    }
}
