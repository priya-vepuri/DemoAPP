package arrays;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] ar = new int[3][4];
		
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i<ar.length;i++)
		{
			for(int j =0; j<ar[i].length;j++)
			{

				System.out.println("Please Enter marks for Class "+i+" Student "+j);
				ar[i][j]= s.nextInt();
			}
		}
		for(int i =0; i<ar.length;i++)
		{
			for(int j =0; j<ar[i].length;j++)
			{

				System.out.println("marks for student Class "+i+" Student "+j+"are "+ar[i][j]);
			}
		}
	}

}
