import java.io.*;
import java.util.*;
class DailyTransactionLimitException extends Exception
{
	DailyTransactionLimitException(int val)
	{
		System.out.println("Value trying to be withdrawn exceeds Daily Limit of 25000 : ("+val+">25000)");
	}
}
class InsufficientAmountException extends Exception
{
	InsufficientAmountException(int balance)
	{
		System.out.println("Insufficient Funds! Current balance : "+balance);
	}
}
public class DriverMain4 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) throws DailyTransactionLimitException, InsufficientAmountException
	{
		int withdraw,balance,choice;
		System.out.println("Enter initial balance : ");
		balance=sc.nextInt();
		int totwid=0;
		while(true)
		{
			System.out.println("MENU:\n1.Withdraw Amount\n2.Show Balance\nEnter your choice : ");
			choice=sc.nextInt();
			try
			{
				switch(choice)
				{
					case 1:
						System.out.println("Withdrawal chosen.");
						System.out.println("Enter Withdrawal amount : ");
						withdraw=sc.nextInt();
						if(balance>withdraw && totwid <= 25000)
							{
								System.out.println("Withdrawal successful.");
								balance-=withdraw;
								totwid+=withdraw;
							}
						else if(withdraw>balance )
							throw new InsufficientAmountException(balance);
						else if(totwid>25000)
							throw new DailyTransactionLimitException(totwid);
						break;
					case 2:
						System.out.println("Show Balance");
						System.out.println("Balance : "+balance);
						break;
					default :
						System.out.println("Operation Complete, Exiting the program");
						return;
				}
			}
			catch(DailyTransactionLimitException e)
			{
				System.out.println("DTL caught");
			}
			catch(InsufficientAmountException i)
			{
				System.out.println("IAE caught");
			}
		}	
	}
}