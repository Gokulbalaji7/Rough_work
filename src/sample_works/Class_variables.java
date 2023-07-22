package sample_works;

public class Class_variables {

	private void cricket() {
		int time = 12345;
		System.out.println(time);

		System.out.println(score);
	}

	int score = 54321;

	long members = 5555555l;

	public static void main(String[] args) {

		Class_variables ob = new Class_variables();

		ob.cricket();

		System.out.println(ob.members);

	}
}
