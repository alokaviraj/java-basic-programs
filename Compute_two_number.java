import java.util.*;
public class Compute_two_number {

	public static void main(String[] args) {
		one o=new one();
		o.disp();

	}

}
class one{
	int a,n,rem,sum=0;
	void disp() {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your number");
		   n=obj.nextInt();
		 rem=n%10;
		 n=n/10;
		 sum+=rem;
		 rem=n%10;
		 n=n/10;
		 sum+=rem+n;
		 System.out.println(sum);
	}
}