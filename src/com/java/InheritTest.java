package com.java;

class A
{
	public A(){
		System.out.println("A without a parameter ");
	}
	public A(int i){
		System.out.println("A with a parameter+"+i);
	}
}

class B extends A
{
	public B(){
		System.out.println("B without a parameter ");
	}
	public B(int i){
		System.out.println("B with a parameter+"+i);
	}
//	public B(int i){
//		super(i);
//		System.out.println("B with a parameter+"+i);
//	}
}

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B(100);
	}

}
