import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("red\nyellow\nGreen");
	
		String Choice=sc.next();
		if(Choice=="red")
		{
		 System.out.println("stop");	
		}
	else if(Choice=="yellow")
		{
			System.out.println("ready");
		}
		else
		{
			System.out.println("Go");
		}

	}

}

