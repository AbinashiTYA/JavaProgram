
public class string {

	public static void main(String[] args) {
		String str=new String("String");
		StringBuffer sb=new StringBuffer("StringBuffer");
		StringBuilder sbd=new StringBuilder("StringBuilder");
		str.concat("TEST");
		System.out.println(str.indexOf(str.charAt(5)));
		System.out.println(str+sb+sbd);

	}

}
