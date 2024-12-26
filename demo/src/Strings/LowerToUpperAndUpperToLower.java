package Strings;

public class LowerToUpperAndUpperToLower {

	public static void main(String[] args) {
		char ch = 'a';//96
		ch = (char)(ch-32);//96-32 i.e 65 (A)
		//InEUrOn to iNeuRoN
		String s1="InEUrOn";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				s2= s2 +(char)(s1.charAt(i)-32);
			}
			else
			{
				s2= s2 +(char)(s1.charAt(i)+32);
			}
		}
		System.out.println("ConvertedString "+s2);
		
		

	}

}
