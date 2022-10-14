package com.Basicblz;

public class Genric {
	
	public static<T> void disp(T data1[]) {
		
		
		for(T item:data1) {
			System.out.println(item);
			
		}
		
	}

	public static void main(String[] args) {
		
		Integer num1[]= {10,20,30,40,50};
		
		disp(num1);
		
	}

}
