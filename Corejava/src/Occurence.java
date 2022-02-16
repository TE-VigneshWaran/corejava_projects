import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		int[] arr = new int[25];
		System.out.println("Enter the numbers");

		int numbers = ref.nextInt();

		while (numbers != 0) {
			arr[numbers]++;
			numbers = ref.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println((i + 1) + "occurs" + arr[i] + "times");
			}
		}

	}

}
