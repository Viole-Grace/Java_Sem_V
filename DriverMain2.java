import java.io.*;
import java.util.*;
class seconds implements Runnable
{
	public void run()
	{
		try
		{
			int count=0;
			System.out.println("Runs every second");
			//System.out.println("S : "+count+" : ");
			Thread.sleep(1000);
			count++;
		}
		catch (Exception e){}
	}
}
class minutes implements Runnable
{
	public void run()
	{
		try
		{
			int count=0;
			System.out.println("Runs every minute");
			//System.out.print("M : "+count+" : ");
			Thread.sleep(6000);
			count++;
			
		}
		catch(Exception e){}
	}
}
class hours implements Runnable
{
	public void run()
	{
		try
		{
			int count=0;
			System.out.println("Runs every hour");
			//System.out.print("H : "+count+" : ");
			Thread.sleep(3600000);
			count++;
		}
		catch(Exception e){}
	}
}
public class DriverMain2
{
	public static void main(String args[])
	{
		Thread obs=new Thread(new seconds());
		Thread obm=new Thread(new minutes());
		Thread obh=new Thread(new hours());
		obs.start();
		obm.start();
		obh.start();
	}
}