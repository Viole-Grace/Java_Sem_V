import java.io.*;
import java.util.*;
class armstrong
{
	static Scanner sc=new Scanner(System.in);
	public static boolean checkArmstrongNumber(int arm)
	{
		int val=0,pow;
		int d=0;
		int fin=arm;
		while(arm!=0)
		{
			d=arm%10;
			arm=arm/10;
			val=val+d*d*d;
		}
		if (fin==val)
			return true;
		return false;

	}
	public static void main(String args[])
	{
		int n=0;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		armstrong ob=new armstrong();
		if(ob.checkArmstrongNumber(n))
			System.out.println("The given number is an armstrong number");
		else
			System.out.println("Not an armstrong number");
	}
}