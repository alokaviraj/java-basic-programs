import java.util.Scanner;

public class Prime_number_to_given_rage {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
//		System.out.println("Enter your integer to start");
//		int n=obj.nextInt();
		System.out.println("Enter your integer to end");
		int n=obj.nextInt();
		System.out.println("prime no.are");
		int count,sum=0;
		for(int i=1;i<=n;i++) 
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println(i);
//				sum=sum+i;
			}
			}
//		System.out.println("sum of prime no"+sum);
		}
	}



