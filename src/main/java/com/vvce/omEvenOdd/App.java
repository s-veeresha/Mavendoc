package com.vvce.omEvenOdd;

/**
 * Hello world!
 */
public class App {
//	public int add(int a,int b) {
//		return a+b;
//	}
//	
//    public static void main(String[] args) {
//    	App obj=new App();
//        System.out.println("Additio :"+obj.add(10,5));
//    }
	
	public String CheckEvenOdd(int n) {
		if(n%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
	public static void main(String[] args) {
		App obj=new App();
		System.out.println("Number is :"+obj.CheckEvenOdd(10));
		
	}
	
}
