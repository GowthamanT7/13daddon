package java_dsa;
import java.util.Scanner;
//class Node{
//	int data;
//	Node next;
//	Node prev;
//	Node(int data){
//		this.data=data;
//		this.next=null;
//		this.prev=null;
//	}
//}

public class dllmidins {
	Node head;
	Node tail;
	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=null;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
    }
	 public void midins(int data, int n) {
	        Node newNode = new Node(data);
	        Node temp = head;
	        for (int i = 1; temp != null && i <= n / 2; i++) {
	            temp = temp.next;
	        }
	        newNode.prev = temp.prev;
	        temp.prev = newNode;
	    }
	 public void display() {
	        Node temp = tail;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.prev;
	        }
	    }
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		dllmidins s=new dllmidins();
		System.out.println("Enter the Number of elements to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			s.insertAtBeginning(val);
		}
		s.display();
		System.out.println("Enter the Number of elements to be added in middle:");
		int data=sc.nextInt();
		s.midins(data, n);
		s.display();	}
}
