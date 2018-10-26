import java.util.*;
class Node{
	int data;
	Node next=null;
	Node(int d){
		data=d;
	}
}
public class LinkedListReverse{
	Node insert(int d,Node head){
		Node temp1 = new Node(d);
		Node temp=head;
		if(temp==null){
			head=temp1;
		}
		else{
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=temp1;
		}
		return head;
	}
	
	void display(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	Node Reverse(Node head){
		
        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return head; 
     
	}
	public static void main(String[] args){
	Node head=null;
	Scanner sc = new Scanner(System.in);
	LinkedListReverse llr = new LinkedListReverse();
	System.out.println("Enter the size of the linkedlist");
	int n=sc.nextInt();
	System.out.println("Enter the Elements of the linkedlist");
	for(int i=0;i<n;i++){
		int x=sc.nextInt();
		head=llr.insert(x,head);
	}
	llr.display(head);
	head=llr.Reverse(head);
	llr.display(head);
	}
}