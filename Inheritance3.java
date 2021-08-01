
public class Inheritance3 {

	public static void main(String[] args) {
		Hier ob=new Hier();
		ob.out();
		Hierarchical o=new Hierarchical();
		o.output();

	}

}
class H{
	int a,b,c;
	void disp() {
		a=10;
		b=20;
	}
}
class Hier extends H{
	void out() {
		disp();
		c=a+b;
		System.out.println("output of intermediate class="+c);
	}
}
class Hierarchical extends H{
	void output() {
		disp();
		int d=a*b;
		System.out.println("output of sub class = "+d);
	}
}