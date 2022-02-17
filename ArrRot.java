package practicespace2;

import java.util.Scanner;

public class ArrRot {

	public static void main(String[] args) {
		System.out.println("Enter array size followed by its elements");
		int []num=ArrScan();
		disp(num);
		System.out.println("Enter number of rotations");
		Scanner scn=new Scanner(System.in);
		int rot=scn.nextInt();
		rot=rot%num.length;
		
		for(int t=0;t<rot;t++)
		{
			
			int temp= num[num.length-1];
			for(int i=num.length-2;i>=0;i--)
			{
				num[i+1]=num[i];
				
			}
			num[0]=temp;
			
			
	
		}
		disp(num);
		
		
		

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
