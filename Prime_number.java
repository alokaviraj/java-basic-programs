//@coding2.0      
 
//Q.WAP to check integer is prime or not

import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your integer");
		int n=obj.nextInt();
		obj.close();
		int i=1,count=0;
		do {
			if(n%i==0) {
				count++;
			}i++;
		}while(i<=n);
		if(count==2) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		}
}
