package java_dsa;

public class stackpp {
	int[] Stack=new int[5];
	int size=0;
	int top=-1;
	public void push(int n) {
		if(top==4) {
			System.out.println("Nah");
			}
		else {
			Stack[++top]=n;
			size++;
		}
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(Stack[i]);
		}
	}
	public void pop() {
		if(top==-1){
			System.out.println("yoo");
		}
		else {
			--top;
			size--;
		}
	}
	public  static void main(String[] args) {
		stackpp st=new stackpp();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.display();
		st.pop();
		st.pop();
		st.display();
	}

}
