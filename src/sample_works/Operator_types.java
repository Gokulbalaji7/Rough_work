package sample_works;

public class Operator_types {
		
		static int a = 5;
		static int b = 10;
		
		public static void main(String[] args) {
			String iam = "Gokul";
			System.out.println(iam);
			
			System.out.println(b/a);
			
			int add = a+b;
			System.out.println(add);
			int unary = a++;
			System.out.println(unary);
			int unary1 = ++a;
			System.out.println(unary1);
			float unary2 = b--;
			System.out.println(unary2);
			long unary3 = --b;
			System.out.println(unary3);
			
			System.out.println(a<b);
			System.out.println(a>b);
			System.out.println(a<=b);
		}

	}
