package practicespace2;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Enter size of array followed by its elements and a number that you want to search");
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int M=scn.nextInt();
		
		System.out.println(BinaryS(arr,M));
		
	}
	
	public static int BinaryS(int[]arr,int M)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]==M)
			{
				return mid;
			}
			else if(arr[mid]<M)
			{
				s=mid+1;
				
				
			}
			else
			{
				e=mid-1;
			}	
		}
		return -1;
	}
		
	}


