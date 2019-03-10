package LinkedList;
import java.util.*;
public class DoublyLinkedList {
static class Node{
	int data;
	Node next;
	Node prev;
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
static Node head;
public static void insertAtBeg(int data){
	Node n=new Node(data);
	if(head==null)
	{
		head=n;
	}
	else
	{
		n.next=head;
		head.prev=n;
		head=n;
	}
	
	
}
public static void insertAtEnd(int data)
{
	Node n=new Node(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
		}
}
public static void insertAtPos(int pos,int data)
{
	Node n=new Node(data);
	int i,j;
	Node temp4=head,temp5=head;
	for(i=0;i<pos-2;i++)
	{
		temp4=temp4.next;
	}
	for(j=0;j<pos-1;j++)
	{
		temp5=temp5.next;
	}
	temp4.next=n;
	n.prev=temp4;
	n.next=temp5;
	temp5.prev=n;
	
}
public static void print(Node head)
{
	Node temp1=head;
	System.out.println("elements are");
	while(temp1!=null)
	{
		System.out.println( temp1.data);
		temp1=temp1.next;
	}
	
}
public static void deleteAtStart()
{
	Node temp=head;
	head=head.next;
	temp=null;
	
}
public static void deleteAtEnd()
{
	Node temp3=head;
	while(temp3.next.next!=null)
	{
		temp3=temp3.next;
	}
	temp3.next=null;
}
public static void deleteAtPos(int pos)
{
	Node temp6=head,temp7=head;
	int i,j;
	for(i=0;i<pos-2;i++)
	{
		temp6=temp6.next;
	}
	for(j=0;j<pos;j++)
	{
		temp7=temp7.next;
	}
	temp6.next=temp7;
	temp7.prev=temp6;
	
}
public static void main(String args[])
{
	insertAtBeg(50);
	insertAtBeg(40);
	insertAtBeg(30);
	insertAtBeg(20);
	insertAtBeg(10);
	insertAtEnd(60);
	insertAtEnd(70);
	insertAtEnd(80);
	deleteAtPos(3);
	insertAtEnd(90);
	insertAtEnd(100);
	insertAtPos(2,45);
	print(head);
deleteAtStart();
print(head);
deleteAtEnd();
print(head);

}
}
