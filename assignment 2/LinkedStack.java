package LinkedList;
import java.util.*;
 class LinkedStack
{
	 static class Node{
		 int data;
		 Node next;
		 
	 }
	static Node top;
	 void push(int data)
	{
		Node node=new Node();
		node.data=data;
		if(top==null)
		{
			top=node;
		}
		else
		{
			node.next=top;
			top=node;
		}
		
	}
	 void pop()
	{
		if(top==null)
		{
			System.out.println("underflow");
		}
		else
		{
		Node temp=top;
		System.out.println("popped element is"+temp.data);
		top=top.next;
		temp=null;
	}
	}
	 void print()
	{
		Node tes=top;
		System.out.println("Elements are: ");
		while(tes!=null)
		{
			System.out.println(tes.data);
			tes=tes.next;
		}
	}
	 void peek()
	{
		 if(top==null)
		 {
			 System.out.println("NULL");
		 }
		 else
		 {
			 System.out.println("peek element is:"+top.data);
		 }
		
	}
public static void main(String args[])
{
		LinkedStack ls=new LinkedStack();
		ls.push(10);
		ls.push(20);
		ls.push(30);
		ls.push(40);
		ls.push(50);
		ls.push(60);
		ls.push(70);
		ls.print();
		ls.peek();
		ls.pop();
		ls.pop();
		ls.pop();
		ls.peek();
		ls.print();
		
		
}
}
 