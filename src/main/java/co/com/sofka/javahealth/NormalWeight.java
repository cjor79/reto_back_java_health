package co.com.sofka.javahealth;

public class NormalWeight implements HealthStatus {
    @Override
    public String get(){
        return "Normal weight";
    }
}
