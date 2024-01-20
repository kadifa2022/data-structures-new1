package com.cydeo;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[][]{}()"));


    }
    public static boolean isValid(String s){
        Stack <Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch==')'){
                if(stack.isEmpty() || stack.pop() !='(')  return false;
            }else if (ch =='}'){
                if(stack.isEmpty() || stack.pop() !='{') return false;
            }else if(ch ==']'){
                if(stack.isEmpty() || stack.pop() !='[') return false;
            }
            else stack.push(ch);
        }
        if(!stack.isEmpty()) return false;
        return true;
    }


}