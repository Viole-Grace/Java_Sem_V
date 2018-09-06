import java.io.*;
import java.util.*;
class buffer
{
	static Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter a string ");
		String st=sc.next();
		StringBuffer s=new StringBuffer(st);
		String a,i,r,rev;
		int index;
		System.out.println("Enter the string to be appended to the string "+st+" : ");
		a=sc.next();
		System.out.println("Appended string : "+s.append(a));
		System.out.println("Enter character to be inserted into the string : ");
		i=sc.next();
		System.out.println("Enter index for the character to be inserted : ");
		index=sc.nextInt();
		System.out.println("New string after insertion : "+s.insert(index,i));
		System.out.println("Reversed String : "+s.reverse());
		System.out.println("Enter start and end index for replacement : ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("Enter the replace characters : ");
		String newstr=sc.next();
		System.out.println("Replaced string : "+s.replace(start,end,newstr));
		System.out.println("Enter the index for which Substring is needed : ");
		int subindex=sc.nextInt();
		System.out.println("Substring from the given index : "+s.substring(subindex));


	}
	public static void main(String args[])
	{
		buffer obj=new buffer();
		obj.getdata();
	}

}