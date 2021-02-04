/*
Given a string, write a function stringClean(as mentioned below), such that, 
it returns recursively a "cleaned" string where adjacent chars 
that are the same have been reduced to a single char. So "yyzzza" yields "yza".

stringClean(input=>String)

Following are example inputs and corresponding expected output:
stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"


*/
class StringClean
{
	
	public String stringClean(String str)
	{
		if ( str.length() <= 1 ) 
		{
			return str;
		}
		String newstr = "";
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				newstr = newstr + str.charAt(i);
			}
		}
		return newstr + str.charAt(str.length()-1);

	}
}
class Mainclass
{
	public static void main(String args[])
	{
		StringClean ref = new StringClean();
		String str1 = ref.stringClean("yyzzza");
		System.out.println(str1);

		String str2 = ref.stringClean("abbbcdd");
		System.out.println(str2);

		String str3 = ref.stringClean("Hello");
		System.out.println(str3);

		String str4 = ref.stringClean("G");
		System.out.println(str4);
	}
}


/*
Outputs: 

C:\Users\HP\Desktop\STS2\>java Mainclass
yza
abcd
Helo
G

*/


