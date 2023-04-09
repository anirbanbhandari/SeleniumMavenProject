package day10;

public class Try_catch_finally {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		
		System.out.println(x+y);
		 System.out.println(x-y);
		 try
		 {
		 System.out.println(x/y);
		 } 
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 finally
		 {
			 System.out.println("Finally Block");
			 x=5;
			 y=2;
		 }

		 System.out.println(x*y);
		 System.out.println((x*x)+(y*y));


	}

}
