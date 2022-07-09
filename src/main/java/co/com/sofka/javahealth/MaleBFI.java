package co.com.sofka.javahealth;

public class MaleBFI implements BFI{
    @Override
    public double get(double bmi, int age){
        return (1.20*bmi)+(0.23*age)-(10.8*1)-5.4;
    }
}
