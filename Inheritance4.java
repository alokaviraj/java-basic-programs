
public class Inheritance4 {

	public static void main(String[] args) {
		Hybrid obj=new Hybrid();
		obj.output();

	}

}
class Hy{
	int a,b,c;
	void disp() {
		a=10;
		b=20;
	}
}
interface Hyb {
	default void out() {
		int c;
	}
}

class Hybrid extends Hy implements Hyb
{
	void output() {
		disp();
		out();
		c=a+b;
		int d=c*2;
		System.out.println("output of Hybrid class = "+d);
	}
}