import java.io.*;
import java.util.*;
class car
{
	String car_name, car_model, car_color;
	car(String name, String model, String color)
	{
		car_name=name; car_model=model; car_color=color;
	}
	void speed()
	{
		System.out.println("Max Speed of car : 200 kmph");
	}
	void printDetails()
	{
		System.out.println("Car name : "+car_name+"\nCar model : "+car_model+"\nCar color : "+car_color);
	}
}
class FamilyCar extends car
{
	int number_of_seats,number_of_doors;
	double car_price;
	FamilyCar(String name,String model,String color,int seats,int doors,double price)
	{
		super(name,model,color);
		number_of_seats=seats; number_of_doors=doors; car_price=price;
	}
	void speed()
	{
		System.out.println("Family Car, Max Speed : 140 kmph");
	}
	void printDetails()
	{
		System.out.println("Family Car ");
		super.printDetails();
		System.out.println("No. of seats in the car : "+number_of_seats+"\nNo. of doors in the car : "+number_of_doors+"\nPrice of the car : "+car_price);
	}
}
class SportsCar extends car
{
	int number_of_doors,number_of_seats;
	String car_price;
	SportsCar(String name, String model, String color, int doors, int seats, String price)
	{
		super(name,model,color);
		number_of_doors=doors; number_of_seats=seats; car_price=price;
	}
	void speed()
	{
		System.out.println("Sports Car , Max Speed : 320 kmph");
	}
	void printDetails()
	{
		System.out.println("Sports Car ");
		super.printDetails();
		System.out.println("No. of seats in the car : "+number_of_seats+"\nNo. of doors in the car : "+number_of_doors+"\nPrice of the car : "+car_price);
	}
}
public class vehicle
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int dn, sn;
		String n,m,c;
		int input=0;
		System.out.println("Enter your preference: \n1.Family Car\nSports car\nYour Choice : ");
		input=sc.nextInt();
		switch(input)
		{
			case 1: System.out.println("You have chosen Family Car as your preference");
					double p;
					System.out.println("Enter the price of the selected car : ");
					p=sc.nextDouble();
					System.out.println("Enter the following : \nName of the car\nModel of the car\nColor of the car\nNO. of doors in the car [integer]\nNo. of seats in the car [integer]");
					n=sc.next(); m=sc.next(); c=sc.next();
					dn=sc.nextInt(); sn=sc.nextInt();
					FamilyCar obj=new FamilyCar(n,m,c,sn,dn,p);
					obj.speed(); obj.printDetails();
					break;
			case 2: System.out.println("You have chosen Sports Car as your preference");
					String pr;
					System.out.println("Enter the price of the selected car : ");
					pr=sc.next();
					System.out.println("Enter the following : \nName of the car\nModel of the car\nColor of the car\nNO. of doors in the car [integer]\nNo. of seats in the car [integer]");
					n=sc.next(); m=sc.next(); c=sc.next();
					dn=sc.nextInt(); sn=sc.nextInt();
					SportsCar obj1=new SportsCar(n,m,c,dn,sn,pr);
					obj1.speed(); obj1.printDetails();
		}
	}
}