package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWithArraysClass {

	public static void main(String[] args) {
		int[] a = {10,20,15,80,56,43,70};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Key to search");
		int key= s.nextInt();
		Arrays.sort(a);
		System.out.print("sorted array = ");
		for(int x: a)
		{
			System.out.print(x+" ");
			
		}
		System.out.println();
		int res = Arrays.binarySearch(a, key);
		System.out.println(res);

	}

}
