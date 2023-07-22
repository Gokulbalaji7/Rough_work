package sample_works;

import java.util.Scanner;

public class Scanner_sample {
	
		public static void main(String[] args) {

			Scanner ref = new Scanner(System.in);
			
//this functions used only for string typesonly
// next and nextline accept only string not datatypes			
			System.out.println("enter student first name");
			String next = ref.next();
			System.out.println("my first name is - " + 'R'+' '+ next);
			//System.out.println("enter student address");
			//String next2 = ref.nextLine();
			//System.out.println("student address :" + next2);

//this functions used only for datatypes
			System.out.println("enter student age");
			short nextShort = ref.nextShort();
			System.out.println("my age is " + nextShort);

			System.out.println("student mobile num");
			int nextInt = ref.nextInt();
			System.out.println("my mobile num " + '-' + nextInt);

			System.out.println("student account number");
			long nextLong = ref.nextLong();
			System.out.println("my account no" + '-' + nextLong);
			
			ref.close();
		}

	}

	

