
public class anagramCheck {

	public static void main(String[] args) {
		System.out.println(checkAnagram("AdCT","CAT"));

	}
	public static boolean checkAnagram(String s1,String s2)
	{
		String s3=s1.replaceAll("\\s","" ).toLowerCase();
		String s4=s3.replaceAll("\\s","" ).toLowerCase();
		boolean flag=false;
		if(s3.length() !=s4.length())
		{
			return false;
		}
		else if(s3.length()==s4.length())
		{
			
		}
	
		  char ch[]=s3.toCharArray();
		  StringBuilder sb=new StringBuilder(s4);
		  for(char c:ch)
		  {
			 int index=sb.indexOf(""+c);
			 if(index!=-1)
			 {
				 sb.deleteCharAt(index);
				 }
			 else{
				 return false;
			 }
			 }
			
		
		return flag;
		
		
		
		
		
		
		
	}

}
