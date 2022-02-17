package practicespace2;

import java.util.Scanner;

public class ArrInv {

	public static void main(String[] args) {
	
		System.out.println("Enter array size  followed by its elements(Each Element is a single digit)");
		Scanner scn=new Scanner(System.in);
		int []num=ArrScan();
		disp(num);
		System.out.println("The inverse of this array is ");
		int []inv=new int[10];
		for(int idx=0;idx<num.length;idx++)
		{
			int Ridx=num.length-idx;
			int invl=inv.length-1;
		  inv[invl-num[idx]]=Ridx;
		}
		disp(inv);
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
