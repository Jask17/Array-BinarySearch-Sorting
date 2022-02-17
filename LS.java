package practicespace2;

import java.util.Scanner;

public class LS  {

	public static void main(String args[]) {
		System.out.println("Enter");
        int []arr=ArrScan();
        Scanner scn=new Scanner(System.in);
        int M=scn.nextInt();
        System.out.println(LinearSearch(arr,M));

        // Your Code Here
    }
    public static int LinearSearch(int[]arr,int M)
    {
         for(int i=0;i<arr.length;i++)
        {
            if(M==arr[i])
            {
                return i;
            }
        
        
        }
     return -1;
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
