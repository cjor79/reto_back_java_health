package co.com.sofka.javahealth;

public class BFIFactory {
    public double getBFI(double bmi, char gender, int age){
        if (gender == 'f'){
            FemaleBFI femaleBfi = new FemaleBFI();
            return femaleBfi.get(bmi, age);
        }
        if (gender == 'm'){
            MaleBFI maleBfi = new MaleBFI();
            return maleBfi.get(bmi, age);
        }else {
            return 0;
        }
    }
}
