
public class stringToInt {

	public static void main(String[] args) {
		convertStringToInteger("1234");

	}

	public static void convertStringToInteger(String str) {
		 int f=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
		   char ch=str.charAt(i);
		   int a=(int)ch;//It will get the ascii value of the character.
		   f=f*10+(a-48);//formula to get the integer value from character.
		  
		
	}
		 System.out.println(f);

}
}
