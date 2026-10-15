package MyLearnings;

public class SecondProjectmain {
	
	int d ;
	 void add(int a,int b) {
		System.out.println(a+b);
	}
	 static void add(int a,int b,int c) {
		int d=5;
		System.out.print(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		SecondProjectmain obj = new SecondProjectmain();
		SecondProject obj1 = new SecondProject();
		obj.add(10,20);
		obj1.add(10,20,30);
		System.out.println();
		SecondProjectmain.add(67, 90, 90);
		SecondDemo.findBiggest(8, 7, 10);
	}

}
