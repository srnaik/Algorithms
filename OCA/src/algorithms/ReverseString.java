package algorithms;

public class ReverseString {


    public String reverseString(String str){

        if(str == null || str.isEmpty())
            return str;

        StringBuilder sb = new StringBuilder();
        String[] sbArray = str.split(" ");

        for(int i = sbArray.length-1; i >= 0; i--){
            sb.append(sbArray[i]).append(" ");
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String str = " I'am going to India";
        String reverseStr = reverseString.reverseString(str);
        System.out.println(reverseStr);
    }
}
