package co.com.sofka.javahealth;

public class BMI {


    public double getBMI(double weight, double height){

        return weight/(Math.pow(height,2));
    }

    public double getNormalWeight(double weight, double height) {
      Double imc = getBMI(weight,height);

      while (imc > 24.99){
          weight--;
          imc = getBMI(weight,height);
      }
      return weight;
    }
}
