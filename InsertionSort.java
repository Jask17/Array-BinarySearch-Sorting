package practicespace2;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Enter an array for sorting");
		int[]arr=ArrScan();
		disp(arr);
		System.out.println("======================================");
		
		
		for(int count=1;count<arr.length;count++)
		{
			int temp=arr[count];
			int idx=count-1;
			while(idx>=0&&arr[idx]>temp)
			{
				arr[idx+1]=arr[idx];
				arr[idx]=temp;
				idx--;
				
			}
		
		
			
			
		}
		
		disp(arr);
		
		
		
		
		
		

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
	public static void swap(int[]arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
