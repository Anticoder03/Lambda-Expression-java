package LamdaExpressionsDemo;

public class DriverApp {
	public static void main(String[] args) {
//		Shape s1 = radius->Math.PI*radius*radius;
//		System.out.println(s1.area(5));
		
//		Greeting g1 = ()->System.out.println("Welcome to FSD Class");
//		g1.greet();
		Greeting g2 = (name)->System.out.println("Welcome to FSD Class. " + name);
		g2.greet("Ashish");
		
		Foods f1 = (item)->{
			 for (String name : item) {
	                System.out.println(name);
	            }
		};
		String[] list = {
			    "Butter Chicken",
			    "Naan",
			    "Dal Makhni",
			    "Paneer Chilly",
			    "Chicken 65"
			};
		f1.menu(list);
	}
}
