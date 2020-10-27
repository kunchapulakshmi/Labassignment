import java.util.*;
public class Incresing {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n value:");
    int n=sc.nextInt();
    while(n!=0)
    {
    int s1=n%10;
    		n=n/10;
    int s2=n%10;
    if(s1<s2)
    {
    	System.out.println("number is not in increasing order");
    	break;
    }
    
    
	}
	if(n==0)
	{
		System.out.println("number is increasing order");
	}

}
}



