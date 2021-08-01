
public class Using_this_and_super {

	public static void main(String[] args) {
		both o=new both (4,3);
		o.disp();
		next1 ob=new next1(7);
}

}

class both{
	int a,b,c;
	public both(int a, int b) {
		System.out.println("using this keyword");

	 this.a=a;         //current instance
	 this.b=b;        //if we not use this here then we cannot difference between instance variable and parameter
	}
	void disp() {
		c=a+b;
		System.out.println("sum ="+c);
	}
}
class next{
	int a,b,c;
	public next(int a) {
		System.out.println("\nusing super keyword");
		this.a=a;
		b=a;
		c=a+b;
		System.out.println("sum="+c);
	}
}
class next1 extends next{

	public next1(int i) {
		super(i);    // if constructor is default then there is auto call of super keyword
		System.out.println("sub class printed");
	}
	
}