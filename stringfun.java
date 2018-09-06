import java.io.*;
import java.util.*;
class stringfun
{
	static Scanner sc=new Scanner(System.in);
	void func()
	{
		System.out.println("Enter a string : ");
		String s=sc.next();
		System.out.println("Length of String entered : "+s.length()); //gives length
		System.out.println("Trimmed String : "+s.trim()); //removes spaces
		System.out.println("Enter character to be replaced : ");
		char oldch=sc.next().charAt(0);
		System.out.println("Enter the new character : ");
		char newch=sc.next().charAt(0);
		System.out.println("Modified string after replacing "+oldch+" with "+newch+" : "+s.replace(oldch,newch)); //replaces every occ of oldch in the string with newch
		System.out.println("Enter a string to check if it is contained in the string "+s+" : ");
		String sub=sc.next();
		System.out.println(s.contains(sub)); //function returns true if substring is contained, else false
		System.out.println("Enter a string to check if "+s+" and the given string are equal : ");
		sub="";sub=sc.next();
		System.out.println(s.equals(sub)); //function returns true if sub and s are equal, else false

	}
	public static void main(String args[])
	{
		stringfun obj=new stringfun();
		obj.func();
	}
}