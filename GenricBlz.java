package com.Basicblz;

public class GenricBlz {
	
	public static <T> void show(T data[]){
		
		for(T item:data) {
			System.out.println(item);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num[]= {1,2,3,4,5};
		
		show(num);

	}

	

	
}
