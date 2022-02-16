package data_and_operations;

public class Casting {

	public static void main(String[] args) {


		double a = 1.1 ;
		double b = 1 ;
		double c = (double) 1;
		System.out.println(b);
		
		
		//int d = 1.1 ; //error
		int e = (int) 1.1;
		double f = 1.1;
		
		
		String g = Integer.toString(1);
		System.out.println(g.getClass()); 

	}

}
