import java.io.*;
import java.util.*;
class thread1 extends Thread 
{
	public void run()
	{
		try
		{
			System.out.println("Printing prime numbers : ");
			for(int i=2;i<=100;i++)
			{
				int flag=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("Prime Number : "+i);
					Thread.sleep(500);
				}
			}
		}	
		catch (Exception e)
		{
			System.out.println("Exception Caught");
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		System.out.println("Printing numbers divisible by 2 and 4 and 6 : ");
		try
		{
			for(int i=1;i<=100;i++)
			{
				if((i%2==0)&&(i%4==0)&(i%6==0))
				{
					System.out.println("Number divisible : "+i);
					Thread.sleep(500);
				}
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Exception Caught");
		}
	}
}
public class DriverMain1
{
	public static void main(String args[])
	{
		thread1 ob1=new thread1();
		thread2 ob2=new thread2();
		ob1.start();
		ob2.start();
	}
}