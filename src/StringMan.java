
public class StringMan {

	public static void main(String[] args) {
		/*String str="Abinashi Behera";
		String[] ar=str.split(" ");//Abinashi Behera  length=2
		String str1="";
		String str2="";
		for(int i=0;i<=ar.length-1;i++)//0,1
		{
			
			for(int j=ar[i].length()-1;j>=0;j--)//7-0///focus on ar[0]
			{
				str2+=ar[i].charAt(j);//ihsanibA
				
			}
		   str2+=" ";//ihsanibA	areheB 
		}
		System.out.print(str2);  
		*/
		
		int no=234;
		int r=0;
		int rev=0;
		while(no!=0)
		{
			r=no%10;//4
			
			rev=(rev*10)+r;//40
			no=no/10;//23
		}
		
		System.out.println(rev);
		
		
	}
	
	

}
