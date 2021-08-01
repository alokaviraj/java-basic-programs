
public class Inheritance2 {

	public static void main(String[] args) {
		Multiple ob=new Multiple();
		ob.output();
	}

}
class M{
	int a,b,c;
	void disp() {
		a=10;
		b=20;
		
	}
}
class Mult extends M{
	void out() {
		disp();
		c=a+b;
		System.out.println("sum="+c);
	}
}
class Multiple extends Mult{
	void output() {
		out();
		int d=c*2;
		System.out.println("output of multiple class = "+d);
	}
}