import java.io.*;
import java.util.*;
class dupl
{
	static Scanner sc=new Scanner(System.in);
	void display()
	{
		int arr[]=new int[50];
		int freq[]=new int[50];
		Set <Integer> set=new HashSet <Integer>();
		System.out.println("Enter length of the array : ");
		int n=sc.nextInt();
		System.out.print("Enter "+n+" elements in the array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
			freq[i]=-1;
		}
		for(int i=0;i<n;i++)
			set.add(arr[i]);
		System.out.println();
		System.out.println("Unique elements : ");
		Iterator it=set.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					{
						count++;
						freq[j]=0;
					}
			}
			if(freq[i]!=0)
			{
				freq[i]=count;
			}
		}
		System.out.println("Number\t|Frequency");
		for(int i=0;i<n;i++)
		{
			if(freq[i]!=0)
				System.out.println(arr[i]+"\t   "+freq[i]);
		}
	}
	public static void main(String args[])
	{
		dupl ob=new dupl();
		ob.display();
	}
}