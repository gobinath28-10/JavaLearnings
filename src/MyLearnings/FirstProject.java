package MyLearnings;
import java.awt.SystemColor;
import java.util.Scanner;
public class FirstProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*String name = scan.nextLine();
		int age = scan.nextInt();
		scan.nextLine();
		String address = scan.nextLine();
		System.out.println("My name is :"+name);
		System.out.println("My age is :"+age);
		System.out.println("My address is :"+address);
		scan.close();*/
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		int d = a-b;
		int e  = a*b;
		int f = a/b;
		char g= 'm';
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		scan.close();
	}
}