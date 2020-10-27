import  java.util.*;
public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum1=0,sum2=0,sum3=0;
      System.out.print("Enter n value:");
      for(int i=1;i<=n;i++)
      {
    	  sum1=i*i;
    	  sum2=sum2+sum1;
    	  sum3=sum3+i;
    	  
      }
      System.out.println("sum of sqares is "+sum2);
      System.out.println("sqares of sum is "+sum3);
	}

}



