
public class DemoAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30,40};
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		String name  =  "Priyanka Vepuri";
		
		int count = name.toUpperCase().length();
		
		System.out.println("Count: "+count);
		
		StringBuffer name1  =  new StringBuffer( "Priyanka");
		int length = name1.append("vepuri").reverse().length();
		System.out.println("length: "+length);
	}

}
