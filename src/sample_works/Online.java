package sample_works;

import java.util.Scanner;

public class Online {

	public static void main(String[] args) {

		int go = 77;
		long gg = 88;

		Scanner object = new Scanner(System.in);

		System.out.println("student age");
		int age = object.nextInt();
		System.out.println("my age is -" + age);

		System.out.println("your maths mark");
		int mark = object.nextInt();
		System.out.println("my maths mark is -" + mark);

		System.out.println("my tamil mark is -" + go);
		System.out.println("my english mark is - " + gg);

	}
}