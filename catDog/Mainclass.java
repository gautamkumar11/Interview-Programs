/*
Given a string, write a function cat_dog(as mentioned below), such that, 
it returns True if the string ""cat"" and ""dog"" appear the same number of times in the given string.

cat_dog(input=>string)

Following are example inputs and corresponding expected output:
cat_dog('catdog') → True
cat_dog('catcat') → False
cat_dog('1cat1cadodog') → True"

*/

class CatDog
{
	public boolean catDog(String str)
	{
		int[] num = new int[2];
		int count1 = 0;
		int count2 = 0;
		if(str.length()<6)
		{
			return false;
		}
		else
		{
			for(int i=0; i<str.length()-2; i++)
			{
				
				if(str.substring(i,i+3).equals("cat"))
				{
					count1++;
					

				}
				else if(str.substring(i,i+3).equals("dog"))
				{
					count2++;

				}
				
				
			}
		}
			return (count1==count2) && (count1>0 || count1>0);
	}
}


class Mainclass
{
	public static void main(String args[])
	{
		CatDog ref = new CatDog();
		
		boolean b1 = ref.catDog("catdog");
		System.out.println(b1);

		boolean b2 = ref.catDog("catcat");
		System.out.println(b2);

		boolean b3 = ref.catDog("1cat1cadodog");
		System.out.println(b3); 

		boolean b4 = ref.catDog("catg");
		System.out.println(b4); 

		boolean b5 = ref.catDog("mcancadodok");
		System.out.println(b5); 
	}
}

/*

Outputs: 
C:\Users\HP\Desktop\STS2\>java Mainclass
true
false
true
false
false

*/


