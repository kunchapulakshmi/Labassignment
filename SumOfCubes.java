
import java.util.*;
public class SumOfCubes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum1=0;
		while(num!=0)
		{
			
			 int digit=num%10;
			sum1=sum1+digit*digit*digit; 
			num=num/10;
			
		}
		System.out.println("Sum of cubes of this number :" +sum1);
		}
}



