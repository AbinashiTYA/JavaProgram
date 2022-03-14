
public class char_per {

	public static void main(String[] args) {
		calculatediffChar("Daanish@2021");
	}

	private static void calculatediffChar(String str) {
		int len=str.length();
		int upl=0;
		int low=0;
		int digit=0;
		int splch=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{ upl++;}
			else if(Character.isLowerCase(ch))
			   { low++;}
			   else if(Character.isDigit(ch))
			      {digit++;}
			      else{
			    	  splch++;}
			
		}
		double upperperc=(upl*100)/len;
		double lowperc=(low*100)/len;
		double digitperc=(digit*100)/len;
		double spclperc=(splch*100)/len;
		System.out.println("Uppercase per---"+upperperc);
		System.out.println("Lowercase per---"+lowperc);
		System.out.println("Digit per---"+digitperc);
		System.out.println("Special case per---"+spclperc);
		
	}

}
