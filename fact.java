import java.io.*;
import java.util.*;
class fact
{
	static Scanner sc=new Scanner(System.in);
	public static int findFactorial(int f)
	{
		int retval=1;
		for(int i=01;i<=f;i++)
			retval*=i;
		return retval;
	}
	public static void main(String [] args)
	{
		fact ob=new fact();
		System.out.println("Factorial : "+ob.findFactorial(10));
	}
}