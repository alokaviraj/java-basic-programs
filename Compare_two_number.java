import java.util.*;
public class Compare_two_number {

	public static void main(String[] args) {
		Compare co=new Compare();
		co.disp();
		
	}

}
class Compare{
	void disp() {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter first input");
	int a=obj.nextInt();
	System.out.println("enter second input");
	int b=obj.nextInt();
	if(a<b)
	{
		System.out.println(a+"!="+b);
		System.out.println(a+"<"+b);
		System.out.println(a+"<="+b);
		
	}
	else if(a>b) {
	System.out.println(a+"!="+b);
	System.out.println(a+">"+b);
	System.out.println(a+">="+b);}
	else {
		System.out.println(a+"="+b);}
	obj.close();
		
	}
	
	
	
}


