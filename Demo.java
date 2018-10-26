import java.io.*;
import java.util.*;
interface DataStructure 
{
	public void push(int a);
	public int pop();
	public boolean isempty();
	public boolean isfull();
}
class stack implements DataStructure
{
	int array[];
	int stacktop;
	int n;
	stack(int n){
		array=new int[n];
		stacktop=-1;
		this.n=n;
	}
	public void push(int ele){
		if(isfull()){
			System.out.println("STACK IS FULL");
		}
		else{
			array[++stacktop]=ele;
		}
	}
	public int pop(){
		if(isempty()){return -1;}
		return array[stacktop--];
	}
	public boolean isempty(){
		if(stacktop==-1){
			return true;
		}return false;
	}
	public boolean isfull(){
		if(stacktop>=n-1){return true;}return false;
	}
}
class queue implements DataStructure
{
	int array[];
	int front,rear;
	int n;
	queue(int n){
		array=new int[n];
		front=-1;
		rear=-1;
		this.n=n;
	}
	public void push(int ele){
		if(isfull()){
			System.out.println("Queue IS FULL");
		}
		else{
			array[++rear]=ele;
		}
	}
	public int pop(){
		if(isempty()){return -1;}
		return array[front++];
	}
	public boolean isempty(){
		if(rear==-1){
			return true;
		}return false;
	}
	public boolean isfull(){
		if(rear>=n-1){return true;}return false;
	}
}
class Demo{
	public static void main(String args[]){
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("\nDataStructures Menu : \n1.Stack\n2.Queue\nEnter choice:");
		choice=input.nextInt();
		switch(choice){
		case 1:
				System.out.println("Enter the size of stack");
				int n=input.nextInt();
				stack s=new stack(n);
				while(true)
				{
					System.out.println("\nStack operations : \n1.Push\n2.Pop\n3.Exit\nEnter choice: ");
					choice=input.nextInt();
					switch(choice)
					{
						case 1:
							System.out.println("Enter element");
							int ele=input.nextInt();
							if(s.isfull()==false)
							s.push(ele);
						else
							{
								System.out.println("Elements cant be pushed anymore ~!\nPopping elements : ");
								System.out.println(s.pop());
							}
						break;
						case 2:
							System.out.println("Element Popped : ");
							if(s.isempty()==false)
								System.out.println(s.pop());
							else
								System.out.println("Nothing to pop : no elements remaining!");
							break;
						case 3:	System.out.println("Exiting operations");
							return;
					}
				}
		case 2:
			System.out.println("Enter the size of queue");
			int m=input.nextInt();
			queue q=new queue(m);
			while(true)
			{
				System.out.println("\nQueue operations : \n1.Push\n2.Pop\n3.Exit\nEnter choice: ");
				choice=input.nextInt();
				switch(choice)
				{
					case 1:
						System.out.println("Enter element");
						int ele=input.nextInt();
						if(q.isfull()==false)
							q.push(ele);
						else
							{
								System.out.println("Elements cant be pushed anymore ~!\nPopping elements : ");
								System.out.println(q.pop());
							}
						break;
					case 2:
						System.out.println("Element Popped : ");
						if(q.isempty()==false)
							System.out.println(q.pop());
						else
							System.out.println("Nothing to pop : no elements remaining!");
						break;
					case 3:System.out.println("Exiting operations");
						return;
				}
			}
		}
	
	}
}