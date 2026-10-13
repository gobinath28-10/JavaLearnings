package MyLearnings;

public class SecondProjectmain {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.print(a+b+c);
	}
	
	public static void main(String[] args) {
		SecondProjectmain obj = new SecondProjectmain();
		obj.add(10,20);
		obj.add(10,20,30);
	}

}
