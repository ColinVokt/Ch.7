package Colin.vokt;

public class ClassFoodTypes {

	private String name;
	private String type;
	private String weighttype;
	private double weight;
	private String cost;
	private String servings;
	private int cal;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeighttype() {
		return weighttype;
	}
	public void setWeighttype(String weighttype) {
		this.weighttype = weighttype;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getServings() {
		return servings;
	}
	public void setServings(String servings) {
		this.servings = servings;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	
	public void display() {
		
			System.out.println(name);
			System.out.println(type);
			System.out.println(weight);
			System.out.println(weighttype);
			System.out.println(servings);
			System.out.println(cal);
			System.out.println(cost);
	}
	public void costperserving() {
		
	}

	}


