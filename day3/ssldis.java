package java_dsa;
import java.util.Scanner;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}

public class ssldis {
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
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		ssldis s=new ssldis();
		System.out.println("Enter the Number of elements to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			s.insertAtBeginning(val);
		}
		s.display();
	}
}
