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

public class delanypos {
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
	 public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty!");
	            return;
	        }

	        if (position == 0) {
	            head = head.next;
	            return;
	        }

	        node temp = head;
	        for (int i = 0; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            System.out.println("Invalid position!");
	            return;
	        }

	        temp.next = temp.next.next;
	    }

	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		delanypos s=new delanypos();
		System.out.println("Enter the Number of elements to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			s.insertAtBeginning(val);
		}
		s.display();
		 System.out.print("Enter position to delete: ");
	        int delPos = sc.nextInt();

	        s.deleteAtPosition(delPos);
	        s.display();
	}
}
