
public class Nice {

	public static class Good {

		static void method() {
			System.out.println("static method");
		}

		void method(int i) {
			System.out.println("instance method");
		}

	}

	public static void main(String[] args) {

		Good gd = new Good();
		gd.method();

		gd.method(2);
	}

}

/*
  output: static method 
  instance method
 */
