package com.company.emrys.algorithm.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FormedExpressionCheck {

    public static boolean formedExpressionCheck(String expressionString){


        StackData<Character> stackData = new StackData<>(40);

        Map<Character, Character> parenthesesMap = new HashMap<>();
        Set<Character> openingParenthesesSet = new HashSet<>();
        parenthesesMap.put(')','(');
        parenthesesMap.put('}','{');
        parenthesesMap.put(']','[');

        openingParenthesesSet.addAll(parenthesesMap.values());

        System.out.println(parenthesesMap);
        System.out.println(openingParenthesesSet);

        try {
            for (int i = 0; i < expressionString.length(); i++) {

                char ch = expressionString.charAt(i);

                if (openingParenthesesSet.contains(ch)) {
                    stackData.push(ch);
                }

                if (parenthesesMap.containsKey(ch)) {


                       Character lastParen = stackData.pop();

                       if(lastParen != parenthesesMap.get(ch)){
                           return false;
                       }

                }
            }

            return stackData.isEmpty();
        }catch(StackUnderflowException e)
        {
            System.out.println(e.getMessage());
        }catch (StackOverflowException e){
            System.out.println(e.getMessage());
        }
        return false;

    }


    public static void main(String[] args){
      boolean check1 =   formedExpressionCheck("(this) {now}");
      boolean check2 =   formedExpressionCheck("(this {now}");
      boolean check3 =   formedExpressionCheck("(this) {now}");
      boolean check4 =   formedExpressionCheck("(this) {now");

        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);
        System.out.println(check4);


    }
}
