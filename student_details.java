import java.io.*;
import java.util.*;
class Stud
{
	Scanner in=new Scanner(System.in);
	String name;
	int roll_no;
	double subject[]=new double[4];
	Stud(String n,int roll,double sub[])
	{
		name=n;
		roll_no=roll;
		subject=sub;
	}
	void calculateMarks()
	{
		double total=0;
		for(int i=0;i<4;i++)
		{
		total+=subject[i];
		}
		if(total==400)
			System.out.println("Maximum score reached, no need for added percentage.\nPercentage : 100%");
		double check=0.0;
		check= (100*(total+total*0.045)/400);
		if(check > 100)
			System.out.println("Maximum score reached.\nPercentage : 100%");
		else
			System.out.println("Percentage with Non-Technical Events : "+(100*(total+total*0.045)/400)+"%");
	}
	void calculateMarks(int ex)
	{
		double total=0;
		for(int i=0;i<4;i++)
		{
		total+=subject[i];
		}
		if(total==400)
			System.out.println("Maximum score reached, no need for added percentage.\nPercentage : 100%");
		double check=0.0;
		check= (100*(total+total*0.045)/400);
		if(check > 100)
			System.out.println("Maximum score reached.\nPercentage : 100%");
		else
			System.out.println("Percentage with Non-Technical Events : "+(100*(total+total*0.045)/400)+"%");
	}
	void calculateMarks(double ex)
	{
		double total=0;
		for(int i=0;i<4;i++)
		{
		total+=subject[i];
		}
		if(total==400)
			System.out.println("Maximum score reached, no need for added percentage.\nPercentage : 100%");
		double check=0.0;
		check= (100*(total+total*0.045)/400);
		if(check > 100)
			System.out.println("Maximum score reached.\nPercentage : 100%");
		else
			System.out.println("Percentage with Non-Technical Events : "+(100*(total+total*0.045)/400)+"%");
	}
}
public class student_details
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		String name;
		int roll;
		double subject[]=new double[4];
		System.out.println("Enter name : ");
		name=sc.next();
		System.out.println("Enter roll : ");
		roll=sc.nextInt();
		System.out.println("Enter subject marks : ");
		for(int i=0;i<4;i++)
		{
			subject[i]=sc.nextDouble();
		}
		Stud stud1=new Stud(name,roll,subject);
		stud1.calculateMarks();
		stud1.calculateMarks(10);
		stud1.calculateMarks(4.6);
	}
}