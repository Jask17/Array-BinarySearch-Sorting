package practicespace2;

import java.util.Scanner;

public class SelectionSortEfficient {

	public static void main(String[] args) {
		System.out.println("Enter an array for sorting");
		int[]arr=ArrScan();
		disp(arr);
		System.out.println("=========================");
		int max=Integer.MAX_VALUE;
		int min=max;
		int index=0;
	
		for(int t=0;t<arr.length;t++)
		{
		for(int i=t;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				index=i;
				
			}
			

			
		}
		System.out.println(index);
		swap(arr,t,index);
		min=max;
		
		
		
		
		}
		disp(arr);
		// TODO Auto-generated method stub

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
