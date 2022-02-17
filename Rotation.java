package practicespace2;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		System.out.println("Enter a number to rotate followed by how many rotations you need");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int rot=scn.nextInt();
		int Nd=Count(n);
		rot=rot%Nd;
		int d=n%((int)Math.pow(10, rot));
		   n=n/((int)Math.pow(10, rot));
		   n=d*(int)Math.pow(10, Nd-rot)+n;
		   
		   System.out.println(n);
		
	}
		
	
	public static int Count(int n)
	{
		
			
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		return c;
	}
	

}
