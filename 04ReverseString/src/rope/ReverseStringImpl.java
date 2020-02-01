package rope;

import java.util.*;

public class ReverseStringImpl {

    /**
     * O(n) time, O(n) space - Where n is the number of words in a String.
     * @param str
     * @return
     */
    public String reverseWordsInStringString(String str){
        if(str == null || str.length() == 0)
            return " ";
        String[] strArray = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = strArray.length -1; i >= 0; i--){
            if(!strArray[i].equals(" ")){
                builder.append(strArray[i]).append(" ");
            }
        }
        return builder.length() ==0 ? " " : builder.substring(0, builder.length()-1);
    }

    private ReverseStringImpl(){

    }

    public String reverseWords(String s){
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (reversed.length() != 0) {
                    reversed.append(' ');
                }
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }


    public String reverseStringUsingArray(String str){

        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int j = strArray.length-1; j >=0; j--){
            sb.append(strArray[j]);
            if(j > 0)
                sb.append(' ');
        }


        return sb.toString();
    }


    public String reverseString(String string){
        if(string == null || string.isEmpty())
            return null;
        char[] charString = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = charString.length - 1; i >=0; i--){
            stringBuilder.append(charString[i]);
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
      /*  ReverseStringImpl impl = new ReverseStringImpl();
        *//*System.out.println("Enter the string that is to reversed:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();*//*
        String str = impl.reverseStringUsingArray("the sky, is blue");
        System.out.println("Reversed String is: " + str);*/

        Map<String,Set<String>> friendsMap = new HashMap<>();

        Set<String> set = new HashSet<>();
        set.add("sachin");

        String str = "Hello";
        str = str.toLowerCase();
        friendsMap.put("a",set);
        System.out.println(friendsMap);
        friendsMap.get("a").remove("Don");
        System.out.println("After Removing Don"+ friendsMap);
        List<String> arList = new ArrayList<>(friendsMap.get("a"));
        System.out.println("List from Set:" + arList);
    }
}
