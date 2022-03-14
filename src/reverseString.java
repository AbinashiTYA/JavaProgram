import java.util.HashMap;
import java.util.Iterator;

public class reverseString {
	private static void charOccuranceMap(String string) {
		String s=string.toLowerCase();
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> hs=new HashMap<Character,Integer>();
		for(char a:ch)
		{
			if(hs.get(a)==null && a!=' ')
			{
				hs.put(a, 1);
			}
			else if(a!=' ')
			{
				hs.put(a, hs.get(a)+1);
			}
		}
		Iterator<Character> it=hs.keySet().iterator();
		while(it.hasNext())
		{
			Character key=it.next();
			Integer value=hs.get(key);
			System.out.println(key+" "+value);
			
		}
		

		
	}



	
	public static void duplicateChar(String s)
	{
		
		String upp=s.toUpperCase();
		char[] a=upp.toCharArray();
		System.out.println(a);
		for(int i=0;i<=a.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j] && a[i]!=' ')
				{
					count++;
					a[j]=' ';
				}
				
			}
			if(a[i]!=' ' && count>1)
			{
			System.out.println(a[i]+" "+count);	}
			
		}
		
	}
	public static void revWord(String s)
	{
		String str=s;
		String str1[]=str.split(" ");//str1[0]=Abinashi   str1[1]=Behera
		String str2="";
		String str3="";
		String str4="";
		for(int i=0;i<str1.length;i++)//2
		{
			str2=str1[i];
			System.out.println(str2);
			System.out.println(str2.length());//8  6
			for(int j=str2.length()-1;j>=0;j--)
			{
				
				str3=str3+str2.charAt(j);//ihsanibA
				
			}
			str3=str3+" ";
		}
		
	   System.out.print(str3);	
	}
    public static void main(String args[])
    {
	//revWord("Abinashi Behera");
	//duplicateChar("Abinashi Behera");
    	charOccuranceMap("Abinashi Behera");
	
}}
	