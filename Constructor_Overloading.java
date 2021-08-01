
public class Constructor_Overloading {

	public static void main(String[] args) {
		Type o=new Type(5,7);
		Type ob=new Type(5,2.5f);
	}

}
class Type{
	public Type(int x,int y) {        //Parameterize constructor
		int z=x*y;
		System.out.println(z);
	}
	public Type(int x,float y) {        //Parameterize constructor
		float z=x*y;
		System.out.println(z);
	}
}

