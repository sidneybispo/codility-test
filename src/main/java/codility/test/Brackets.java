package codility.test;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String in2 = "{[()()]}";
        //String in2 = "([)()]";
        int result = solution(in2);
        System.out.println(result);
    }

    public static int solution(String S) {
        Stack <Character> stack = new Stack<Character>();

        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else if(stack.size()>0){
                if(c ==')'){
                    if(stack.pop() != '(')
                        return 0;
                }
                if(c ==']'){
                    if( stack.pop() != '[')
                        return 0;
                }
                if(c =='}'){
                    if(stack.pop() != '{')
                        return 0;
                }
            }else{
                return 0;
            }

        }
        if(stack.size()==0){
            return 1;
        }else{
            return 0;
        }

    }

}
