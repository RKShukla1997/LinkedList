import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class LinkedListSwap{
	Node insert(int d,Node head){
		Node temp=head;
		Node temp1=new Node(d);
		if(head==null){
			head = temp1;
			temp = head;
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=temp1;
		}
		return head;
	}
	
	Node swap(Node head,int pos,int pos1,int n) throws Exception{
		Node temp=head;
		Node temp1=head;
		int count=1;
		int count1=1;
		int var;
		while(count!=pos){
			temp=temp.next;
			count++;
		}
		while(count1!=pos1){
				temp1=temp1.next;
				count1++;
			}
			System.out.println(temp.data+" "+temp1.data+" ");
			var = temp.data;
			temp.data=temp1.data;
			temp1.data=var;
			return head;
	}
	
	void display(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args){
		LinkedListSwap ls = new LinkedListSwap();
		Scanner sc = new Scanner(System.in);
		Node temp=null;
		Node temp2=null;
		System.out.println("Enter the size of the LinkedList");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of the LinkedList");
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			temp = ls.insert(x,temp);
		}
		  ls.display(temp);
		  System.out.println("Enter the positions to swap");
		  int pos=sc.nextInt();
		  int pos1=sc.nextInt();
		  try{
		  temp=ls.swap(temp,pos,pos1,n);
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
		  ls.display(temp);
	}
}