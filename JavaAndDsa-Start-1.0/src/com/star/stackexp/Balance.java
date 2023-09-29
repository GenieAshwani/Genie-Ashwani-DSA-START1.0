package com.star.stackexp;

import java.util.Stack;

public class Balance {

    public static void main(String[] args) {

        String s="{()}[]]";

  
        if(isBalanceString(s))
        {
            System.out.println("String is balanced");
        }
        else {
             System.out.println("String not balanced");
        }
    }

    public static boolean isBalanceString(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i< s.length();i++)
        {
            if(s.charAt(i)=='{')
            {
                stack.add('}');
            }
            else if(s.charAt(i)=='[')
            {
                stack.add(']');
            }
            else if (s.charAt(i)=='(')
            {
                stack.add(')');
            }
            else {
                if(stack.isEmpty())
                {
                    return false;
                }
                char cc=stack.pop();
                if(s.charAt(i)!=cc)
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
