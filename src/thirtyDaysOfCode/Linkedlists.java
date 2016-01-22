package thirtyDaysOfCode;

import java.util.Scanner;

public class Linkedlists {
	
	public static  LinkedListNode insert(LinkedListNode head,int data)
	{
		if(head == null) return new LinkedListNode(data);
		
		LinkedListNode traverse = head;
		while(traverse.next != null){
			traverse = traverse.next;
		}
		traverse.next = new LinkedListNode(data);
		
		return head;
	}
	
	public static void display(LinkedListNode head)
    {
          LinkedListNode start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          LinkedListNode head=null;
          int N=sc.nextInt();
          while(N-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);
          sc.close();
   }
   
}

class LinkedListNode{
	int data;
	LinkedListNode next;
	
	LinkedListNode(int d){
        data=d;
        next=null;
    }
}