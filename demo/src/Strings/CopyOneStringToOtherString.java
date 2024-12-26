package Strings;

public class CopyOneStringToOtherString {

	public static void main(String[] args) {
		String s1 = "priya";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			s2= s2 +s1.charAt(i);
		}
		System.out.println("First String = "+s1);
		System.out.println("Copied String = "+s2);


	}

}
