package practicespace2;

import java.util.Scanner;

public class ArrRev {

	public static void main(String[] args) {
		System.out.println("Enter size of an array and its elements for reversal");
		int[]num=ArrScan();
		disp(num);
		System.out.println("The reversed array is ");
		int start=0;
		int end=num.length-1;
		while(start<end)
		{
			
			int temp=num[end];
			num[end]=num[start];
			num[start]=temp;
			
			
			System.out.println(start+"-"+end);
			
			start++;
			end--;
		}
		System.out.println("End of loop"+start+" "+end);
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


}
