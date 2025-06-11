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

public class dllmidrm {
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
	 public void midins(int n) {
	        Node temp = head;
	        for (int i = 1; temp != null && i <= (n / 2)-1; i++) {
	            temp = temp.next;
	        }
	        temp.next = temp.next.next;
	    }
	 public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	    }
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		dllmidrm s=new dllmidrm();
		System.out.println("Enter the Number of elements to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			s.insertAtBeginning(val);
		}
		s.display();
		s.midins(n);
		System.out.println("mid remover");
		s.display();	}
}
