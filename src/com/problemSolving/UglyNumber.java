package com.problemSolving;

public class UglyNumber {
	public boolean isUgly(int num) {
		while(num%2==0) {
			num/=2;
		}
		
		while(num%3==0) {
			num/=3;
		}
		
		while(num%5==0) {
			num/=5;
		}
		
		return num==1;
	}
	
	public static void main(String[] args) {
		UglyNumber obj=new UglyNumber();
		//boolean result=obj.isUgly(10);
		//System.out.println(result);
		for(int i=1;i<=100;i++)
		{
			if(obj.isUgly(i))
				System.out.print(i+" ");
		}
		
	}

}
