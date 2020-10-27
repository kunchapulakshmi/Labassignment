import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n value");
     int n=sc.nextInt();
     System.out.println("The prime numbers are:");
     
     for(int i=1;i<=n;i++) 
     {
    	 int count=0;
    	for(int j=1;j<=i;j++)
    	{
    	if(i%j==0)
    	  count++;
    	}
    	if(count==2)
    		System.out.println(i);
     
     }
	}

}




