package sample_works;

public class Local_variable {


	private void engineer() {

		String name = "mechanical";
		name = "gokul";
		System.out.println(name + '.');
		
		int year = 8888; 
		year = 77777;
		System.out.println(year);

	}

	public static void main(String[] args) {

		Local_variable obj = new Local_variable();

		obj.engineer();

	}

}