package com.java;

import java.util.Stack;
import java.util.regex.Pattern;

public class nowcoder1 {
	public static void main(String[] args) {
	        
	            String input ="3+2*{1+2*[-4/(8-6)+7]}";
	            System.out.println((int)suffixToArithmetic(infix2Suffix(input)));

	    }
	     
	    //先将中缀表达式转换成后缀表达式
	    public static String infix2Suffix(String expression) {
	        Stack<Character> stack = new Stack<Character>();
	        String buffer = "";
	        for(int i = 0; i < expression.length(); i++){
	            char ch = expression.charAt(i);
	            Character tmp;
	            switch (ch) {
	            case ' ':
	                break;
	            case '(':
	                stack.push(ch);
	                break;
	            case '[':
	                stack.push(ch);
	                break;
	            case '{':
	                stack.push(ch);
	                break;
	            //加法和减法的优先级最低，如果是碰到乘除则需要将栈顶符号弹出，然后入栈
	            //如果碰到的是乘除则直接入栈
	            case '+':
	                while(stack.size() != 0){
	                    tmp = stack.pop();
	                    if(tmp == '(' || tmp == '[' || tmp == '{'){
	                        stack.push(tmp);
	                        break;
	                    }
	                    buffer += " " + tmp;
	                }
	                stack.push(ch);
	                buffer += " ";
	                break;
	            case '-':
	                //对于-号来说，需要判断是减号还是负号，如果是减号则和+号的处理方式一样，否则我们加入一个0
	                while(stack.size() != 0){
	                    tmp = stack.pop();
	                    if(tmp == '(' || tmp == '[' || tmp == '{'){
	                        stack.push(tmp);
	                        //buffer += "0";
	                        break;
	                    }
	                    buffer += " " + tmp;
	                }
	                stack.push(ch);
	                buffer += " ";
	                break;
	            case '*':
	            case '/':
	                //如果栈顶元素优先级比乘法或除法低，则*和/进栈
	                while(stack.size() != 0){
	                    tmp = stack.pop();
	                    if(tmp == '(' || tmp == '[' || tmp == '{' || tmp == '+' || tmp == '-'){
	                        stack.push(tmp);
	                        break;
	                    }
	                    buffer += " " + tmp;
	                }
	                stack.push(ch);
	                buffer += " ";
	                break;
	            case ')':
	                //右边的符号，则一直输出，知道碰到对应的左符号
	                while (stack.size() != 0) {
	                    tmp = stack.pop();
	                    if (tmp == '(')
	                        break;
	                    else
	                        buffer += " " + tmp;
	                }
	                buffer += " ";
	                break;
	            case ']':
	                while (stack.size() != 0) {
	                    tmp = stack.pop();
	                    if (tmp == '[')
	                        break;
	                    else
	                        buffer += " " + tmp;
	                }
	                buffer += " ";
	                break;
	            case '}':
	                while (stack.size() != 0) {
	                    tmp = stack.pop();
	                    if (tmp == '{')
	                        break;
	                    else
	                        buffer += " " + tmp;
	                }
	                buffer += " ";
	                break;
	            default:
	                buffer += ch;
	            }
	        }
	        while (stack.size() != 0) {
	            buffer +=  " " + stack.pop();
	        }
	        return buffer;
	    }
	     
	    public static double suffixToArithmetic(String postfix) {
	 
	        Pattern pattern = Pattern.compile("\\d+||(\\d+\\.\\d+)"); // 使用正则表达式匹配数字
	        String strings[] = postfix.split(" "); // 将字符串转化为字符串数组
	        for (int i = 0; i < strings.length; i++){
	            strings[i].trim(); // 去掉字符串首尾的空格
	        }
	        Stack<Double> stack = new Stack<Double>();
	 
	        for (int i = 0; i < strings.length; i++) {
	            if (strings[i].equals(""))
	                continue;
	 
	            // 如果是数字，则进栈
	            if ((pattern.matcher(strings[i])).matches()) {
	                stack.push(Double.parseDouble(strings[i]));
	            } else {
	                // 如果是运算符，弹出运算数，计算结果。
	                double y = stack.pop();
	                double x = stack.pop();
	                stack.push(caculate(x, y, strings[i])); // 将运算结果重新压入栈。
	            }
	        }
	        return stack.pop(); // 弹出栈顶元素就是运算最终结果。
	 
	    }
	 
	    private static double caculate(double x, double y, String simble) {
	        if (simble.trim().equals("+"))
	            return x + y;
	        if (simble.trim().equals("-"))
	            return x - y;
	        if (simble.trim().equals("*"))
	            return x * y;
	        if (simble.trim().equals("/"))
	            return x / y;
	        return 0;
	    }}
