package java_dsa;
import java.util.Scanner;
//class node{
//	int data;
//	node next;
//	node(int data){
//		this.data=data;
//		this.next=null;
//	}
//}

public class insanypos {
	node head;
	public void insertAtBeginning(int data) {
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;
    }
	 public void display() {
	        node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	    }
	 public void insertAtPosition(int data, int position) {
	        node newNode = new node(data);
	        if (position == 0) {
	            insertAtBeginning(data);
	            return;
	        }

	        node temp = head;
	        for (int i = 0; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Invalid position!");
	            return;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		insanypos s=new insanypos();
		System.out.println("Enter the Number of elements to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			s.insertAtBeginning(val);
		}
		s.display();
		 System.out.print("Enter value to insert: ");
	        int value = sc.nextInt();
	        System.out.print("Enter position: ");
	        int position = sc.nextInt();

	        s.insertAtPosition(value, position);
	        s.display();
	}
}
