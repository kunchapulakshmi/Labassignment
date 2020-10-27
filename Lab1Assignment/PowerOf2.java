import java.util.*;

public class PowerOf2{

public static void main(String[] args)

{

//int num=0;

int rem=0;

Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");

int num=sc.nextInt();

if(num==0)

{

System.out.println("no");

}

while (num!=1)

{

rem=num%2;

num=num/2;

}

if(num==1 && rem==0)

{

System.out.println("yes");

}

else{

System.out.println("no");

}

}

}






