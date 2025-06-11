package java_dsa;

import java.util.Scanner;

//class node01{
//	int data;
//	node01 next;
//	node01(int data){
//		this.data=data;
//		this.next=null;
//	}
//}
public class delfstcll {
	node01 last;
	public void insert(int data) {
		node01 newNode=new node01(data);
		if(last==null) {
			newNode.next=newNode;
			last=newNode;
		}
		else {
			newNode.next=last.next;
			last.next=newNode;
			last=newNode;
		}
	}
	public void refst() {
		last.next=last.next.next;
	}
	public void display() {
		node01 temp = last.next;
       do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last);
       System.out.print(temp.data);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		delfstcll c=new delfstcll();
		System.out.println("Enter the Number of elements to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			c.insert(val);
		}
		c.display();
		c.refst();
		System.out.println("removed first element:");
		c.display();
	}
}
