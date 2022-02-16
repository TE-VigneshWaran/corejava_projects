import java.util.Scanner;

public class StringUpperCase {

	public static void main(String[] args) {
		
		String upStr;
		int i;
		
		Scanner ref=new Scanner(System.in);
		
		System.out.println("Enter the string");
		upStr=ref.next();
		
		char[] upch=upStr.toCharArray();
		
		for ( i = 0; i < upch.length; i++) {
			if(upch[i]>'A'&&upch[i]<'Z') {
				upch[i]=(char)((int)upch[i]+32);
			}
		}
		
		for (i = 0; i< upch.length; i++) {
			System.out.println(upch[i]);
		}

	}

}
