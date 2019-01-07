package Colin.vokt;

public class Store {

	public static void main(String[] args) {
		
		ClassFoodTypes food1 =  new ClassFoodTypes();
		ClassFoodTypes food2 =  new ClassFoodTypes();
		
		
		
		
		food1.setName("Omaha Steaks");
		food1.setType("Meat");
		food1.setWeight(2);
		food1.setWeighttype("lbs per serving size");
		food1.setServings("Serveing size 1 Stek");
		food1.setCal(500);
		food1.setCost("$10.00");
		
		food2.setName("Chocolate Milk");
		food2.setType("Dariy");
		food2.setWeight(300);
		food2.setWeighttype("ml per serving size");
		food2.setServings("Servering size 1 Cup");
		food2.setCal(200);
		food2.setCost("$03.00");
		
		
		
		food1.display();
		System.out.println("\n");
		food2.display();
	

	}

}
