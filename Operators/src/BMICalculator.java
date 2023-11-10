
public class BMICalculator {

	public static void main(String[] args) {
		// BMI = weight in kg / (height * height);
		
		double height = 5.11;
		double weight  = 85;
		
		double heightInMts = height * 0.4536;
		
		double myBMI = weight / (heightInMts * heightInMts);
		System.out.println("My BMI is : " + myBMI);
	}

}
