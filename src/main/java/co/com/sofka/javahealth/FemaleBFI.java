package co.com.sofka.javahealth;

public class FemaleBFI implements BFI{
    @Override
    public double get(double bmi, int age){
        return (1.20*bmi)+(0.23*age)-(10.8*0)-5.4;
    }
}
