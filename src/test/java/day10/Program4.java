package day10;

public class Program4 {
	int a = 1;
	int b = 2;

	public Program4() {
		System.out.println("Program4 is Started");
	}

	private Program4(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Program4 pro1 = new Program4();
		System.out.println(pro1.a + pro1.b);

		Program4 pro2 = new Program4(20, 30);
		System.out.println(pro2.a + pro2.b);

	}

}
