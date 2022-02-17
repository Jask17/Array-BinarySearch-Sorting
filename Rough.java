package practicespace2;

import java.util.Scanner;

public class Rough {
	 public static void main(String args[]) {
		 System.out.println("Enter");
	        Scanner scn=new Scanner(System.in);
	        int size=scn.nextInt();
	        int count=0;
	        int []arr=new int[size];
	        for (int i=0;i<arr.length;i++)
	        {
	            
	            arr[i]=scn.nextInt();
	            if(arr[i]==0)
	            { count++;}
	                
	            
	        }

	    for(int t=0;t<count;t++)
	    {
	        arr[t]=0;
	        
	    }
	    for(int t=count+1;t<arr.length;t++)
	    {
	        arr[t]=1;
	    }
	        disp(arr);


	    }
	    public static void swap(int[]arr,int a,int b)
		{
			int temp=arr[a];
			arr[a]=arr[b];
			arr[b]=temp;
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
