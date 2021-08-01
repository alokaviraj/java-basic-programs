
public class Types_of_constructor {

	public static void main(String[] args) {
		Type1 o=new Type1();
		Type2 ob=new Type2(5,7);

	}

}
class Type1{             
	int a,b,c;
	public Type1() {         //default constructor
		 a=10;
		 b=20;
		 c=a+b;
		 System.out.println(c);
		
	}
}
class Type2{
	public Type2(int x,int y) {        //Parameterize constructor
		int z=x*y;
		System.out.println(z);
	}
}