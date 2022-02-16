import java.util.Scanner;

public class StringLowerCase {

	public static void main(String[] args) {
		
		String str;
		
		int i;
		
		Scanner ref=new Scanner(System.in);
		
		System.out.println("Enter the String");
		str=ref.next();
		
		char[] st=str.toCharArray();
		
		for (i = 0; i < st.length; i++) {
			if(st[i]>'A'&&st[i]<'Z') {
				st[i]=(char)((int)st[i]+32);
			}
			
		}
		for (i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
		

	}

}
