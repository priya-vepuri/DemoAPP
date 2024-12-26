package searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90};
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Key to search");
		int key= s.nextInt();
		int low=0, high=a.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(key == a[mid])
			{
				System.out.println("Key "+key+" found at index "+mid);
				break;
			}
			else if(key<a[mid])
			{
				high = mid-1;
			}
			else if(key>a[mid])
			{
				low = mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("index not found");
		}
		


	}}
