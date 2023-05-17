package com.example.javaproject2.algorithm.week5;

import java.util.Stack;
import java.util.StringTokenizer;

public class PostFixCalculator {
    String infix = null;
    Stack<String> postFix = new Stack<String>();

    public PostFixCalculator(String _infix){
        _infix = _infix.trim();
        _infix = _infix.replaceAll(" ", "");
        infix=_infix;
        inToPost();
    }

    public void inToPost(String infix) {
        postFix.clear();
        Stack<String> stack = new Stack<>();
        StringTokenizer stringtonkenizer = new StringTokenizer(infix, "()+-*/%", true);
        while(stringtonkenizer.hasMoreTokens()) {
            String string = stringtonkenizer.nextToken();

            //피연산자일 경우 그냥 저장한다.
            if("()+-*/%".indexOf(string) == -1)	{
                postFix.push(string);
            }
            //닫히는 괄호일 때
            else if(string.equals(")"))	{
                while(!stack.peek().equals("("))
                    postFix.push(stack.pop());
                //(를 제거한다.
                stack.pop();
            }

            //피연산자도, 오른쪽괄호도 아닐경우
            else{
                while(!stack.isEmpty() && (inStackPriority((String)stack.peek()) >= inCommingPriority(string)))	{
                    postFix.push(stack.pop());
                }
                stack.push(string);
            }
        }

        //끝을 지났으면 스택의 모든 내용을 지운다.
        while (!stack.isEmpty()){
            postFix.push(stack.pop());
        }
    }
    public void inToPost() {
        inToPost(this.infix);
    }

    public String getPostFix() {
        String result = "";
        for(int i = 0 ; i < postFix.size() ; i++) {
            result += (String)postFix.get(i) + " ";
        }
        return result;
    }

    public double calculate(){
        Stack<String> stack = new Stack<String>();
        for(int i = 0 ; i < postFix.size() ; i++){
            String tempValue = (String)postFix.get(i);
            if("*/+-".indexOf(tempValue) != -1){

                double num1 = Double.parseDouble((String)stack.pop());
                double num2 = Double.parseDouble((String)stack.pop());
                double temp = 0.;
                if(tempValue.equals("*"))
                    temp = num1 * num2;
                else if(tempValue.equals("/"))
                    temp = num1 / num2;
                else if(tempValue.equals("%"))
                    temp = num1 % num2;
                else if(tempValue.equals("+"))
                    temp = num1 + num2;
                else if(tempValue.equals("-"))
                    temp = num1 - num2;

                stack.push(String.valueOf(temp));
            }
            else
                stack.push(tempValue);
        }

        if(stack.size() == 1)
            return Double.parseDouble(stack.pop());

        return -1;
    }

    private int inStackPriority(String s) {
        if(s.equals("*")) return 2;
        else if(s.equals("/")) return 2;
        else if(s.equals("%")) return 2;
        else if(s.equals("+")) return 1;
        else if(s.equals("-")) return 1;
        else if(s.equals("(")) return 0;
        else  return 0;
    }

    private int inCommingPriority(String s) {
        if(s.equals("*")) return 2;
        else if(s.equals("/")) return 2;
        else if(s.equals("%")) return 2;
        else if(s.equals("+")) return 1;
        else if(s.equals("-")) return 1;
        else if(s.equals("(")) return 4;
        else  return 0;
    }

    public static void main(String[] args) {
        PostFixCalculator pfc = new PostFixCalculator("10.6+7.8*2.6-3*7/3+10-2");
        System.out.println(pfc.getPostFix());
        double result = pfc.calculate();
        System.out.println(result);
    }
}
