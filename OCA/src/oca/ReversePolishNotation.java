package oca;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReversePolishNotation {

    private Stack<Integer> stack = new Stack<>();

    interface Operator{
        int eval(int oper1, int oper2);
    }

   /* private static final Map<String,Operator> OPERATOR = new HashMap<>(){{

        put("+", new Operator() {
            @Override
            public int eval(int oper1, int oper2) {
                return oper1 + oper2;
            }
        });

        put("-", new Operator() {
            @Override
            public int eval(int oper1, int oper2) {
                return oper1 - oper2;
            }
        });

        put("*", new Operator() {
            @Override
            public int eval(int oper1, int oper2) {
                return oper1 * oper2;
            }
        });

        put("/", new Operator() {
            @Override
            public int eval(int oper1, int oper2) {
                return oper1/oper2;
            }
        });
    }

    };


    public int evaluateExpression(String[] expressions){

        for (String str: expressions) {
            if(OPERATOR.containsKey(str)){
                int oper1 = stack.pop();
                int oper2 = stack.pop();
                stack.push(OPERATOR.get(str).eval(oper1,oper2));
            }else{
                stack.push(Integer.parseInt(str));
            }
        }

       return stack.peek();
    }*/

    public static void main(String[] args) {

        String[] str = {"2", "1", "+", "3", "*"};

        //ReversePolishNotation polishNotation = new ReversePolishNotation();
        //int result = polishNotation.evaluateExpression(str);
        //System.out.println("Final Result of RPN is : " + result);
        System.out.println("Hello World");
    }

}
