package practicespace2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter an array for sorting");
		int []arr=ArrScan();
		disp(arr);
		for(int count=1;count<arr.length;count++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1]<arr[i])
				{
					Swap(arr,i,i+1);
				}
			}
			disp(arr);
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
	public static void Swap(int[]arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
