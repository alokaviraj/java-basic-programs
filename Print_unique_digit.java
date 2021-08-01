//import java.util.*;
public class Print_unique_digit {
	public static void main(String[] args) {
//		Scanner obj=new Scanner(System.in);
//		System.out.println("enter four digit number");
//		int a=obj.nextInt();
		int count=0;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					if(k != j && k!=j && i!=j) {
						count++;
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		System.out.println("total number of the the digits="+count);

	}

}
