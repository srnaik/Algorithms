package rope;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

    private static final Map<Character,Character> hsMap = new HashMap<Character, Character>(){{
        put('(',')');
        put('{','}');
        put('[',']');
    }};

    public boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(Character c : str.toCharArray()){
            if(hsMap.containsKey(c)){
                stack.push(c);
            }else if(stack.isEmpty() || hsMap.get(stack.pop())!= c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParantheses validParantheses = new ValidParantheses();
        validParantheses.isValid("]}[{");
    }
}
