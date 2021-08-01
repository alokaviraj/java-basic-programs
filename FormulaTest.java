

public class FormulaTest {

	public static void main(String[] args) {
		double a=4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
		System.out.println(a);
		
		
		//Area and Perimeter circle
		float r= 7.5f;
		float Perimeter=(float)(2*Math.PI*r);
		float Area=(float)(Math.PI*r*r);
		System.out.println("\nArea and Perimeter of circle");
		System.out.println("perimeter="+Perimeter);
		System.out.println("Area="+Area);
		
		
		
		//Area and Perimeter of Rectagle
		
		double w=5.5;
		double l=8.5;
		double A=l*w;
		double p=2*(l+w);
		

		System.out.println("\nArea and Perimeter of Rectagle");
		System.out.println("perimeter="+p);
		System.out.println("Area="+A);
		
		
		//Swap of 2 variable
		
//		int S=42334;
//		int t=33567;
		String S="alok";
		String t="kumar";
		String temp;
		System.out.println("s="+S);
		System.out.println("t="+t);
		
		temp=S;
		S=t;
		t=temp;
		System.out.println("s="+S);
		System.out.println("t="+t);
		
		
		
	}

}
