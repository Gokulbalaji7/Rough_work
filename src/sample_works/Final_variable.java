package sample_works;

public class Final_variable {
	
		int score = 54321;
		
		long members = 5555555l;
		
		final int count = 11;

		private void cricket() {
			int time = 12345;
			System.out.println(time);
			
			System.out.println(score);
			System.out.println(count);
		}

		public static void main(String[] args) {

			Final_variable ob = new Final_variable();

			ob.cricket();

			System.out.println(ob.members);
			System.out.println(ob.count);

		}

	}
	
	
