import java.io.*;
import java.util.*;
class invoice
{
	static Scanner sc=new Scanner(System.in);
	private int item_id,item_type,item_quantity;
    private String item_name;
    private double item_price;
    public void getDetails()
    {
    	System.out.println("Item Id : "+item_id+"\nItem Type : "+item_type+"\nItem quantity : "+item_quantity+"\nItem name : "+item_name+"\nItem price : "+item_price);
    }
    public void setDetails()
    {
    	System.out.println("\n\nEnter the following : \nItem ID [int] : \nItem Type [int]: \nItem Quantity [int]: \nItem name [string] : \nItem price [double] : ");
    	item_id=sc.nextInt(); item_type=sc.nextInt(); item_quantity=sc.nextInt();
    	item_name=sc.next(); 
    	item_price=sc.nextDouble();
    }	
    private double calculateTax(int type, double price)
    {
    	double tax = 0.0;
    	switch(type)
    	{
    		case 1: tax=0.05*price;
    				break;
    		case 2: tax=0.12*price;
    				break;
    		case 3: tax=0.18*price;
    				break;
    		case 4: tax=0.28*price;
    				break;
    	}
    	return tax;
    }
    void printInvoice()
    {
    	System.out.println("Calculate Tax : \nItem type :");
    	double tax=calculateTax(item_type,item_price);
    	System.out.println("Bill  : ");
    	getDetails();
    	System.out.println("Tax : "+tax);
    }
	public static void main(String args[])
	{
		invoice[] obj=new invoice[10];
		System.out.println("Enter number of items : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("\nItem "+(i+1));
			obj[i]=new invoice(); obj[i].setDetails();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\nItem "+(i+1));
			obj[i].printInvoice();
		}

	}
}