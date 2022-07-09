package co.com.sofka.javahealth;

import org.json.simple.JSONObject;
import java.util.HashMap;

public class User {

	private final int age;
	private final char gender;
	private final double weight;
	private final double height;


	public User(int age, char gender, double weight, double height) {
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	public double getBMI() {
		BMI bmi = new BMI();
		return bmi.getBMI(weight, height);
	}

	public double getBFI() {
		BFIFactory bfiFactory = new BFIFactory();
		return bfiFactory.getBFI(getBMI(), gender, age);
	}

	public String getStatus(){
		HealthStatusFactory statusFactory = new HealthStatusFactory();
		return statusFactory.getStatus(getBMI()).get();
	}

	public double getNormalWeight() {
		BMI bmi = new BMI();
		return bmi.getNormalWeight(weight, height);
	}

	public JSONObject getReport() {
		HashMap<String,Object> report = new HashMap<>();
	
		report.put("status", getStatus());
		report.put("healthyWeight", getNormalWeight());
		report.put("bmi", getBMI());
		report.put("bfi", getBFI());

		return new JSONObject(report);
	}
}
