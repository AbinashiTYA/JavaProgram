import java.util.Arrays;

public class strManipulation {
	public static void main(String args[])
	{
		//reverseWordOfString("I Love Testing");
		reverseWordOfStringByReversingEachWord("I Love Testing");
		
	}
	
	public static void reverseWordOfString(String str)
	{
		String str1=str;
		String out="";
		String[] a= str1.split("\\s");//{"I","Love","Testing"} ---> Testing love I  ---> gnitseT evoL I
		for(int i=a.length-1;i>=0;i--)
		{
		 out=out+a[i]+" ";
		}
		System.out.println(out);
	}
	
	public static void reverseWordOfStringByReversingEachWord(String str)
	{
		String str1=str;
		String out="";
		String f="";
		String g="";
		String space=" ";
		String[] a= str1.split("\\s");//{"I","Love","testing"}
		for(int i=a.length-1;i>=0;i--)
		{
			 out=out+a[i]+" ";	
		}
		System.out.println(out);
		String[] b=out.split("\\s");
		 for(int j=0;j<b.length;j++)
		 {
			 f=b[j];
			 for(int k=f.length()-1;k>=0;k--)
			 {
				 g=g+f.charAt(k);
			 }
			 g+=space;
			 
		 }
		 System.out.println(g);
		  
		}
		
	}


