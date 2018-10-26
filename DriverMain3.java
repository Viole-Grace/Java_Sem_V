import java.io.*;
import java.util.*;
class Data 
{
    private boolean transfer = true;
    public void display_java() 
    {
        while(true)
        {   
            synchronized(this)
            {
                while (!transfer) 
                {
                    try 
                    { 
                        wait();
                    }
                    catch (InterruptedException e)  
                    {
                        Thread.currentThread().interrupt(); 
                    }
                }
                transfer = false;
                System.out.print("JAVA");
                notify();
            }
        }
    }
    public void display_programming() 
    {
        while(true){   
            synchronized(this)
            {
                while (transfer) 
                {
                    try 
                    { 
                        wait();
                    }
                    catch (InterruptedException e) 
                    {
                        Thread.currentThread().interrupt(); 
                    }
                }
                transfer = true;
                System.out.print("  PROGRAMMING \n");
                notify();
            }
        }
    }
}
class th1 extends Thread
{   Data obj1;
    th1(Data obj)
    {
        obj1=obj;
    }
    public void run()
    {
        obj1.display_java();
    }
}
class th2 extends Thread
{   Data obj1;
    th2(Data obj)
    {
        obj1=obj;
    }
    public void run()
    {
        obj1.display_programming();
    }
}
public class DriverMain3
{
    public static void main(String args[])
    {
	    Data obj=new Data();
        th1 t1 =new th1(obj);
        th2 t2 =new th2(obj);
        t1.start();
        t2.start();
    }
}