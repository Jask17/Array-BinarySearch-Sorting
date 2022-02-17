package practicespace2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Enter an array for sorting");
		int[]arr=ArrScan();
		int []sortArr=new int[arr.length];
		
		System.out.println("==================");
		int Max=Integer.MAX_VALUE;
		int min=Max;
		int index=0;
	for(int t=0;t<sortArr.length;t++)	
	{
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				index=i;
			
				
				
				
			}
			
		}
		
		
		sortArr[t]=min;
	    arr[index]=Max;
	    min=Max;
	    System.out.println(index);
		
	}	
	disp(arr);

	disp(sortArr);
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
	

}
