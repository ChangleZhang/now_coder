package com.java;

import java.util.Stack;
import java.util.regex.Pattern;

public class nowcoder1 {
	public static void main(String[] args) {
	        
	            String input ="3+2*{1+2*[-4/(8-6)+7]}";
	            System.out.println((int)suffixToArithmetic(infix2Suffix(input)));

	    }
	     
	    //�Ƚ���׺���ʽת���ɺ�׺���ʽ
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
	            //�ӷ��ͼ��������ȼ���ͣ�����������˳�����Ҫ��ջ�����ŵ�����Ȼ����ջ
	            //����������ǳ˳���ֱ����ջ
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
	                //����-����˵����Ҫ�ж��Ǽ��Ż��Ǹ��ţ�����Ǽ������+�ŵĴ���ʽһ�����������Ǽ���һ��0
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
	                //���ջ��Ԫ�����ȼ��ȳ˷�������ͣ���*��/��ջ
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
	                //�ұߵķ��ţ���һֱ�����֪��������Ӧ�������
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
	 
	        Pattern pattern = Pattern.compile("\\d+||(\\d+\\.\\d+)"); // ʹ��������ʽƥ������
	        String strings[] = postfix.split(" "); // ���ַ���ת��Ϊ�ַ�������
	        for (int i = 0; i < strings.length; i++){
	            strings[i].trim(); // ȥ���ַ�����β�Ŀո�
	        }
	        Stack<Double> stack = new Stack<Double>();
	 
	        for (int i = 0; i < strings.length; i++) {
	            if (strings[i].equals(""))
	                continue;
	 
	            // ��������֣����ջ
	            if ((pattern.matcher(strings[i])).matches()) {
	                stack.push(Double.parseDouble(strings[i]));
	            } else {
	                // ��������������������������������
	                double y = stack.pop();
	                double x = stack.pop();
	                stack.push(caculate(x, y, strings[i])); // ������������ѹ��ջ��
	            }
	        }
	        return stack.pop(); // ����ջ��Ԫ�ؾ����������ս����
	 
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
