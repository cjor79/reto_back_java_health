package co.com.sofka.javahealth;

public class HealthStatusFactory {

    public HealthStatus getStatus(double bmi){

        if (bmi < 16.00){
            return new SevereThinness();
        }else if (bmi > 16.00 && bmi < 16.99){
            return new ModerateThinness();
        }else if (bmi > 17.00 && bmi < 18.49){
            return new AcceptableThinness();
        }else if (bmi > 18.50 && bmi < 24.99){
            return new NormalWeight();
        }else if (bmi > 25.00 && bmi < 29.99){
            return new Overweight();
        }else if (bmi > 30.00 && bmi < 34.99){
            return new ObeseType1();
        }else if (bmi > 35.00 && bmi < 40.00){
            return new ObeseType2();
        }else {
            return new ObeseType3();
        }
    }
}
