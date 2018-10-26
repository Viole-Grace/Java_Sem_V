import java.io.*;
import java.util.*;
interface EncryptDecrypt
{
	public void Encrypt(int s, int e);
	public void Decrypt(int s, int e);
}
class Encrypt_Message implements EncryptDecrypt
{
	static Scanner sc=new Scanner(System.in);
	public void Encrypt(int s, int e)
	{
		
		//int shift=e%plain.length();
		if(s==1)
		{
			String plain="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String input;
			System.out.println("Enter a string in Capitals: ");
			input=sc.nextLine();
			for(int i =0;i<input.length();i++)
			{
				if(input.charAt(i)==' ')
						System.out.print(" ");
				for(int j=0;j<plain.length();j++)
				{
					if(input.charAt(i)==plain.charAt(j))
						System.out.print(plain.charAt((j+e)%plain.length()));
				}
			}
			System.out.println("\nOperation Complete");
		} 
		else if(s==2)
		{
			String plain="ZYXWVUTSRQPONMLKJIHGFEDCBA";
			String input;
			System.out.println("Enter a string in Capitals: ");
			input=sc.nextLine();
			for(int i =0;i<input.length();i++)
			{
				if(input.charAt(i)==' ')
						System.out.print(" ");
				for(int j=0;j<plain.length();j++)
				{
					if(input.charAt(i)==plain.charAt(j))
						System.out.print(plain.charAt((j+e)%plain.length()));
				}
			}
			System.out.println("\nOperation Complete");
		}
	}
	public void Decrypt(int s, int e)
	{
		System.out.println("Decryption Selected : ");
		Encrypt((s%2)+1,e);
	}
}
class Encrypt_Number implements EncryptDecrypt
{
	static Scanner sc=new Scanner(System.in);
	public void Encrypt(int s, int e)
	{
		if(s==1)
		{	
			String plain="0123456789";
			String input;
			System.out.println("Enter a phone number : ");
			input=sc.next();
			for(int i=0;i<input.length();i++)
			{
				for(int j=0;j<10;j++)
				{
					if(input.charAt(i)==plain.charAt(j))
						System.out.print(plain.charAt((j+e)%plain.length()));
				}
			}
			System.out.println("\nOperation complete");
		}
		else if(s==2)
		{
			String plain="9876543210";
			String input;
			System.out.println("Enter a phone number : ");
			input=sc.next();
			for(int i=0;i<input.length();i++)
			{
				for(int j=0;j<10;j++)
				{
					if(input.charAt(i)==plain.charAt(j))
						System.out.print(plain.charAt((j+e)%plain.length()));
				}
			}
			System.out.println("\nOperation complete");	
		}
	}
	public void Decrypt(int s, int e)
	{
		System.out.println("Number Decryption Selected");
		Encrypt((s%2)+1,e);
	}
}
public class EncryptMain //implements EncryptDecrypt//Encrypt_Number, Encrypt_Message
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int start,end;
		System.out.println("EncryptDecrypt\n");
		EncryptDecrypt em=new Encrypt_Message();
		EncryptDecrypt en=new Encrypt_Number();
		System.out.println("Enter the type of Encryption / Decryption :\n1.Forward\n2.Backward\nEnter your choice : ");
		start=sc.nextInt();
		System.out.println("Enter the shift for the cipher : ");
		end=sc.nextInt();
		System.out.println("Encryption");
		em.Encrypt(start,end);
		en.Encrypt(start,end);
		//System.out.println("Decryption");
		em.Decrypt(start,end);
		en.Decrypt(start,end);
	}
}