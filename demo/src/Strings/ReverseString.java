package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "ineuron java";
		String s2 = "";
		
		String[] str = s1.split(" ");
		for(String s: str)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				
				s2=s2+s.charAt(i);
			}
			s2= s2+ " ";
		}
		System.out.println(s2);

	}

}
