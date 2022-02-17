package practicespace2;

import java.util.Scanner;

public class ArrRot2 {

	public static void main(String[] args) {
		System.out.println("Enter the array lenght followed by it's elements");
		int []num=ArrScan();
		disp(num);
		
		System.out.println("Enter no of rotations you want");
		Scanner scn=new Scanner(System.in);
		int r=scn.nextInt();
		r=r%num.length;
		num=Rev(num,num.length-1-(r-1),num.length-1);
	
		num=Rev(num,0,num.length-r-1);
		
		num=Rev(num,0,num.length-1);
		disp(num);
		
		
		
		
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
	public static int[]Rev(int[]a,int start,int end)
	{
		while(start<end)
		{
			int temp=a[end];
			a[end]=a[start];
			a[start]=temp;
			
			
			start++;
			end--;
		}
		return a;
	}
	


}
