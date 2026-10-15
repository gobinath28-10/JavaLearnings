package MyLearnings;

public class SecondDemo {
	static void findBiggest(int a,int b,int c) {
		if(a>b || a>c) {
			System.out.println("Biggest number is :"+ a);
		}
		if(b>a || b>c) {
			System.out.println("Biggest number is :"+ b);
		}
		if(c>a || c>b) {
			System.out.println("Biggest number is :"+ c);
		}
		
		
	}
	public static void main(String[] args) {
		SecondDemo obj = new SecondDemo();
		obj.findBiggest(10,15,20);
	}
}
