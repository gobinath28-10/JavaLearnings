package MyLearnings;

class Car {
	 int price;
	 String brand;
	 
	Car(int price, String brand){
		 
	    this.price = price;
	    this.brand = brand;
	}
	void Milage(){
		int km = 20;
		System.out.println("Milage is:"+ km);
	}
	void EngineType() {
		String type="V3";
		System.out.println("Engine name is:"+type);
	}
}
public class FourthProject{
	public static void main(String[] args) {
		Car f1 = new Car(2000000,"BMW");
		f1.Milage();
		f1.EngineType();
		System.out.println(f1.price);
	}
}