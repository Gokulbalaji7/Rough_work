package sample_works;

public class Child_surya extends Parent_sivakumar {

	@Override
	public void vibrator() {
System.out.println("ahparea");	}
	
	@Override
	public void pump() {
		System.out.println("cwpm");
	}


	public static void main(String[] args) {

		Child_surya actor = new Child_surya();

		actor.vibrator();
		actor.pump();
	

	}

}
