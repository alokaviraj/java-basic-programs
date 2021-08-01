
//@codin2.0              

//Q. WAP to define multiple class in java

public class Coding2_0 {

	public static void main(String[] args) {
	    Sum obj= new Sum();
		obj.a=10;
		obj.b=20;
		obj.disp();
		System.out.println("sum =" +obj.total);		
	}		
}
class Sum{
	int a,b;
	int total;
	int disp() {	
	total=a+b;
	return total;
	}
}

