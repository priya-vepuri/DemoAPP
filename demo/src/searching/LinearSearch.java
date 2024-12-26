package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70,80,90};
		boolean flag = false;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Key to search");
		int key= s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Key "+key+" found at index "+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		System.out.println("Key Not Found");

	}

}
