package Stack;
import java.util.*;
public class Implementation {
	static Scanner sc=new Scanner(System.in);
	static int n=sc.nextInt();
	static int a[]=new int[n];
	static int top=-1;
	public static void push(int data){
		if(top==n-1)
		{
			System.out.println("STACK OVERFLOW");
			return;
		}
		else{top++;
		a[top]=data;
		}
	}
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("STACK UNDERFLOW");
			return;
		}
		else
		{
			System.out.println("POPPED ELEMENT IS:" +a[top]);
			top--;
		}
		
	}
	public static void top()
	{
		System.out.println("Element at the top is"+ a[top]);
		
	}
	public static void print()
	{
		System.out.println("ELEMENTS ARE:");
		for(int i=0;i<=top;i++)
		{
			System.out.println(a[i]);
		}
	}
public static void main(String args[])
{
	push(10);
	push(20);
	push(30);
	push(40);
	push(50);
	push(60);
	print();
	pop();
	print();
	pop();
	pop();
	pop();
	print();
	
	
}
}
