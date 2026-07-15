package com.problemSolving;

public class HarshadNumber {
	public boolean isHarsh(int num)
	{
		int sum=0;
		int temp=num;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		return temp%sum==0;
	}

	public static void main(String[] args) {
		HarshadNumber obj=new HarshadNumber();
		System.out.println(obj.isHarsh(18));

	}

}
