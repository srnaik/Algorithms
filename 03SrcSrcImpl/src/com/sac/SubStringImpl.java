package com.sac;

public class SubStringImpl {

    public int isSubstring(String hayStack, String needle){

        if(hayStack == null || needle == null)
            return 0;
        if(needle.isEmpty())
            return 0;

        for(int i = 0; i < hayStack.length(); i++){
            if( i+ needle.length() > hayStack.length())
                return -1;
            int m = i;
            for(int j = 0; j < needle.length(); j++){
                if(needle.charAt(j) == hayStack.charAt(m)){
                    if(j == needle.length()-1)
                        return i;
                    m++;
                }else{
                    break;
                }
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        SubStringImpl subString = new SubStringImpl();
        int index = subString.isSubstring("hello","aao");
        if(index > 0){
            System.out.println("SubString is found at index: " + index);
        }else{
            System.out.println("SubString not found");
        }
    }
}
