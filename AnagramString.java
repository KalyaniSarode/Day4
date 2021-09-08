package test;
import java.util.Arrays;

public class AnagramString {
	
	static void isAnagram(String str1, String str2) {
		String s1=str1.replaceAll(" \\s", " ");
		String s2=str2.replaceAll(" \\s"," ");
		boolean status=true;
		if(s1.length()!=s2.length())
		{
			status=false;
			
			
		}
		else
		{
			char[]ArraysS1=s1.toLowerCase().toCharArray();
			char[]ArraysS2=s2.toLowerCase().toCharArray();
			Arrays.sort(ArraysS1);
			Arrays.sort(ArraysS2);
			status=Arrays.equals(ArraysS1, ArraysS2);
			
			
		}
		if(status)
		{
			System.out.println(s1+" and" +s2+ " Are Anagrams");
			
		}
		else
		{
			System.out.println(s1+"and "+s2+" Are Not Anagrams");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isAnagram("Keep","Peek");
		isAnagram("Mother in law", "Hitler Women" );
	}

}
