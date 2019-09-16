package Static;

public class App {
	public static void main(String[] args) {
		//box();
		//person();
		
	}
	public static void box() {
		Box box1 = new Box();
		Box box2 = new Box();
		box1.colour = "Green";
		box1.item = "Pen";
		System.out.println(Box.item + Box.colour); 
		//static variables belong to the class, not to the instance in the class
		
		Box.speak();
	}
	public static void person() {
		Person Hasnaine = new Person();
		Person Martin = new Person();
		Person William = new Person();
		for (Person person : Person.people){
			System.out.println(person);
		}
		
	}
	
	
}
