package MyLearnings;

class LearnConstructor{
	int x;
	String name;
	
	LearnConstructor(){
		x = 10;
		name = "gobi";
	}
	void display() {
		System.out.println(x);
		System.out.println(name);
	}
	public static void main(String[] args) {
		LearnConstructor ls = new LearnConstructor();
		ls.display();
	}
}
