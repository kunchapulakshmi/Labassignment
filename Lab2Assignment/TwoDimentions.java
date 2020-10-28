import java.util.*;
public class TwoDimentions {

public static void main(String[] args) {
// TODO Auto-generated method stub
String[] num=new String[100];
String sum="";
int count=0;
int n=0;
do {
Scanner sc=new Scanner(System.in);
System.out.println("1.Park car");
System.out.println("2.Get car count");
System.out.println("3.show avalible parking slots");
n=sc.nextInt();
switch(n)
{
case 1:System.out.println("Enter owner name");
String name=sc.next();
System.out.println("Enter registration number");
String vis=sc.next();
sum=sum+vis+",";
break;
case 2:num=sum.split(",");
count=num.length;
System.out.println("total cars count in parking:"+count);
break;
case 3:if(count<100)
{

if(count<=10)
{
int v=100-count;
System.out.println("you have "+v+" Parking slots in 1st Story");
}
if(count<=20)
{
int v=70-count;
System.out.println("you have "+v+" Parking slots in 2st Story");
}
if(count<=50)
{
int v=50-count;
System.out.println("you have "+v+" Parking slots in 3st Story");
}
if(count<=70)
{
int v=20-count;
System.out.println("you have "+v+" Parking slots in 4st Story");
}
if(count<=100)
{
int v=10-count;
System.out.println("you have "+v+" Parking slots in 5st Story");
}

return;


}
else
{
System.out.println("parking place is not there");
}
break;
}

}while(n!=0);

}
}





