import java.util.HashMap;
import java.util.Iterator;

public class stringmanipulation {

		
		public static void main(String[] args)
		{
			//printCharWise();
			//occuranceOfEachChar("AbinashiBehera");
			makeOutput();
					
		}
		
	 static void makeOutput() {
		String str1="ABC";
		String str2="DEF";
		String str3=str1.concat(str2);
		System.out.println(str3);
		String str4=str1.substring(0,1)+str2+str1.substring(1);
		System.out.println(str4);
		}

	public static void printCharWise()
	{
		String str="Let's deep dive in string Manipulations $ in JAVA.";
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]);
		}
	}
	
	public static void occuranceOfEachChar(String str)
	{   String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char letter : ch)
		    { 
			if(hm.get(letter)==null)
		         {
			      hm.put(letter,1);
		          }
		      hm.put(letter,hm.get(letter)+1);
		     }
		Iterator<Character> letter= hm.keySet().iterator();
		while(letter.hasNext())
		{
			char d=letter.next();
			if(hm.get(d)>1)
			{
				System.out.println(d+"----------->"+hm.get(d));
			}
		}
	}

	}



