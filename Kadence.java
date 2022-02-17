package practicespace2;

import java.util.Scanner;

public class Kadence {

	public static void main(String[] args) {
		System.out.println("Enter an array");
		int[]num=ArrScan();
		int sum=0;
		int max=0;
	for(int i=0;i<num.length;i++)
	{
		sum=sum+num[i];
		if(sum<0)
		{
			sum=0;
		}
		max=Math.max(max, sum);
		System.out.println(sum+"-"+num[i]);
	}
	System.out.println(max);

	}
	public static int[] ArrScan()
	{
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
	
		return arr;
		
	}
	public static void disp (int []a)
	{
		for(int ele: a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		
	}

}
