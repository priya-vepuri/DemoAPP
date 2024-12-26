package arrays;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please Enter marks for student "+i);
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("marks for student "+i+"="+a[i]);
		}
	}

}
