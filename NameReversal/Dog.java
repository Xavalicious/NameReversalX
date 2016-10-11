
public class Dog {

	private String color;
	private String breed;
	private double weight;
	private double height;
	
	public Dog (String c, String b, double w, double h) {
		color = c;
		breed = b;
		weight = w;
		height = h;
	}
	
	public void chgWeight(double newWeight) {
		weight = newWeight;
	}
	
  public void seeColor() {
	  System.out.println(color);
  }
	

}
