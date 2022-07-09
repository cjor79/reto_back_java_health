package co.com.sofka.javahealth;

public class AcceptableThinness implements HealthStatus {
    @Override
    public String get(){
        return "Underweight: Acceptable thinness";
    }
}
