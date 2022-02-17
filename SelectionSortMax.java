package practicespace2;

import java.util.Scanner;

public class SelectionSortMax {

	public static void main(String[] args) {
		
		System.out.println("Enter an array ");
		int[]arr=ArrScan();
		disp(arr);
		System.out.println("========================================");
		for(int counter=1;counter<arr.length;counter++)
		{
			int top_place=arr.length-counter;
			int max_index=top_place;
		for(int i=0;i<top_place;i++)
		{
			if(arr[max_index]<arr[i])
			{
				max_index=i;
			}
		}
		swap(arr,max_index,top_place);
		
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
