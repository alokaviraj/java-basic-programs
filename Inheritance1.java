public class Inheritance1 {

	public static void main(String[] args) {
		s obj=new s();
		obj.out();
	}
}
class single{
	int a,b,c;
	void disp() {
		a=10;
		b=20;
		
	}
}
class s extends single{
	void out() {
		disp();
		c=a+b;
		System.out.println("sum="+c);
	}
}