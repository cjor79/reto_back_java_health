package co.com.sofka.javahealth;

public class SevereThinness implements HealthStatus {
    @Override
    public String get(){
        return "Underweight: Severe thinness";
    }
}
