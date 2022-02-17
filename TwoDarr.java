package practicespace2;

import java.util.Scanner;

public class TwoDarr {

	public static void main(String[] args) {
		System.out.println("Enter a 2D array");
		Scanner scn=new Scanner(System.in);
		int [][] arr=new int [3] [3];
		for(int r=0;r< arr.length;r++)
		{
			for(int c=0; c<arr[0].length;c++)
			{
				arr[r][c]=scn.nextInt();
			}
		}
		
		
		// Printing
		
		for(int c=0;c< arr[0].length;c++)
		{
			for(int r=0; r<arr.length;r++)
			{
				System.out.print(arr[r][c]+" ");
			}
           System.out.println();
		}
		

	}

}
