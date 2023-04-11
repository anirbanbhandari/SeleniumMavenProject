package day10;

public class Program5 extends Program4 {
	Program5() {
		super.a = 200;
		super.b = 500;
	}

	public static void main(String[] args) {

		Program5 x = new Program5();
		System.out.println(x.a + x.b);

	}

}
