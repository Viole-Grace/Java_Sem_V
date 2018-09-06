import java.io.*;
import java.util.*;
class fib
{  
	static Scanner sc=new Scanner (System.in);
	public static void displayFibonacci()
	{
		int n1=0,n2=1,n3,i,count=0;
		System.out.println("Enter count : ");
		count=sc.nextInt();    
		System.out.println("First "+count+" Fibonacci numbers are : \n");
		System.out.print(n1+" "+n2);
		for(i=2;i<count;++i) 
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		 } 
		 System.out.println();   
	}
	public static void main(String args[])  
	{    
	 fib obj=new fib();
	 obj.displayFibonacci();
  
	}	
}  