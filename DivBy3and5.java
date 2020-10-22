import java.util.*;
public class DivBy3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner sc=new Scanner(System.in);
	   	System.out.println("Enter n value: ");
	   	int n=sc.nextInt();
	   	System.out.println("the number divisible by 3 and 5 are: ");
	   	for(int i=1;i<=n;i++)
	   	{
	   		if(i%3==0||i%5==0)
	   		{
	   			System.out.println(i);
	   		}
	   	}
	}

}





