import java.io.*;
import java.util.*;
abstract class shape
{
	double d1,d2;
	abstract double calc();
	abstract void disp();
}
class triangle extends shape
{
	double area=0.0;
	triangle(double a, double b)
	{
		d1=a; d2=b;
	}
	double calc()
	{
		area=0.5*d1*d2;
		return area;
	}
	void disp()
	{
		System.out.println("The given height and base of the triangle are : "+d1+" and "+d2+" , making a total area of : "+area);
	}
}
class square extends shape
{
	double area=0.0;
	square(double a,double b)
	{
		d1=a;d2=b;
	}
	double calc()
	{
		area=d1*d1;
		return area;
	}
	void disp()
	{
		System.out.println("The given side of the square is : "+d1+" , maing a total area of : "+area);
	}
}
class rectangle extends shape
{
	double area=0.0;
	rectangle(double x, double y)
	{
		d1=x; d2=y;
	}
	double calc()
	{
		area=d1*d2;
		return area;
	}
	void disp()
	{
		System.out.println("The Given Dimensions are : "+d1+" and "+d2+" , with area = "+area);
	}
}
class area
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int i;
		double x,y;
		System.out.println("Enter the shape : \n1.Triangle\n2.Square\n3.Rectangle\nEnter your choice : ");
		i=sc.nextInt();
		switch(i)
		{
			case 1: System.out.println("Enter the base and height: ");
					x=sc.nextDouble(); y=sc.nextDouble();
					triangle obj=new triangle(x,y);
					obj.calc(); obj.disp();
					break;
			case 2: System.out.println("Enter the side : ");
					x=sc.nextDouble();
					square obj1=new square(x,0);
					obj1.calc(); obj1.disp();
					break;
			case 3: System.out.println("Enter length and breadth : ");
					x=sc.nextDouble(); y=sc.nextDouble();
					rectangle obj2=new rectangle(x,y);
					obj2.calc(); obj2.disp();
					break;
			default: System.out.println("Invalid input, exiting program ");
		}
	}
}
