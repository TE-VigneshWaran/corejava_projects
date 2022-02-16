package come.te.java8features.methods;
import java.util.ArrayList;
import java.util.List;


public class Methods {
	
	
		public static void main(String[] args) {
			
			List<Integer> ref = new ArrayList<Integer>();
			
			ref.add(11);
			ref.add(7);
			ref.add(17);
			ref.add(74);
			ref.add(1);
			ref.add(9);
			ref.add(3);
			ref.add(4);
			
			System.out.println("Original"+ref);
			System.out.println();
			
			ref.forEach(a->
			System.out.println(a*a)
			);
			
			
			System.out.println();
			
			System.out.println("After forEach"+ref);
			
			System.out.println("--- method ref(non static) ---");
			ref.forEach(System.out::println);
			
			System.out.println("--- method ref(static) ---");
			
			ref.forEach(Methods::getData);
			System.out.println("----------------------------------------------------");
			
			ref.removeIf(x -> {
				return x > 7;
			});
			
			ref.removeIf(Methods::filter);
			
			System.out.println(" after remove if "+ref);
			
		}
		
		public static void getData(int a) {
			System.out.println(a+ " from other method");
		}
		
		public static boolean filter(int a) {
			return a>7;
		}
	}

