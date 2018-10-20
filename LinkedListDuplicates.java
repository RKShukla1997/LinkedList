import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}

public class LinkedListDuplicates{
	
	Node insert(int d,Node head){
		Node temp=head;
		Node temp1=new Node(d);
		if(temp==null){
			head=temp1;
			temp1.next=null;
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
	/*
	Node remove_dup(Node head){
		Node prev=head;
		Node curr=prev.next;
		int r;
		while(curr!=null){
			r=prev.data;
			if(curr.data==r){
						
			}
			else if(curr.data==prev.data){
				curr=curr.next;
				prev.next=curr;
			}
			else{
				curr=curr.next;
				prev=prev.next;
			}
		}
		return head;
	}
	*/
	/*
	Node remove_duplicates(Node head){
		//Node Curr=head;
		//Node prev;
		Node prev=head;
		Node curr=prev.next;
		while(curr!=null){
			//prev=curr;
			//curr=curr.next;
			if(curr.data==prev.data){
				//prev.next=curr.next;
				//why is this statement not working in place of the given statement
				//it goes into the infinite loop.
			   curr=curr.next;
				prev.next=curr;
			}
			else{
			curr=curr.next;
			prev=prev.next;
			}
		}
		return head; 
	}
	*/
	
	Node remove_duplicates(Node head){
		Node curr = head;
		Node ne = null;
		Node pre = null;
		while(curr.next != null)
		{
			
			pre = curr;
			ne = curr.next;
			while(ne != null){
				if(curr.data == ne.data){
					pre.next = ne.next;
				}
					pre = ne;
					ne = ne.next;
			}
			curr = curr.next;
		}
		return head; 
	}
	
	public static void main(String[] args){
		Node temp=null;
		Scanner sc = new Scanner(System.in);
		LinkedListDuplicates ld = new LinkedListDuplicates();
		System.out.println("Enter the size of the linked list");
		int n = sc.nextInt();
		System.out.println("Enter the Elements of the linked list");
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			temp=ld.insert(x,temp);
		}
		ld.remove_duplicates(temp);
		//ld.remove_dup(temp);
		ld.display(temp);
	}
}