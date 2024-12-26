package arrays;

import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		int[][][] ar = new int[2][3][3];
		
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i<ar.length;i++)
		{
			for(int j =0; j<ar[i].length;j++)
			{
				for(int k =0; k<ar[i][j].length;k++)
				{
				System.out.println("Please Enter marks for College "+i+" Class "+j+" Student "+k);
				ar[i][j][k]= s.nextInt();
				}
			}
		}
		for(int i =0; i<ar.length;i++)
		{
			for(int j =0; j<ar[i].length;j++)
			{
				for(int k =0; k<ar[i][j].length;k++)
				{
				System.out.println("marks for student College "+i+" Class "+j+" Student "+k+"are "+ar[i][j][k]);
				}
			}
		}
	}

}
