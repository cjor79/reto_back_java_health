package co.com.sofka.javahealth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMITest {
    @Test
    public void normalBMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(72,1.70);
        assertEquals(24.91, bmi, 25);
    }

    @Test
    public void serverThinnessBMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(40,1.70);
        assertEquals(13.84, bmi, 0.2);
    }

    @Test
    public void moderateThinnessBMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(47,1.70);
        assertEquals(16.26, bmi, 0.2);
    }

    @Test
    public void acceptableThinnessBMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(50,1.70);
        assertEquals(17.3, bmi, 0.2);
    }

    @Test
    public void overweightBMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(80,1.70);
        assertEquals(27.68, bmi, 0.2);
    }

    @Test
    public void obeseType1BMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(87,1.70);
        assertEquals(30.1, bmi, 0.2);
    }

    @Test
    public void obeseType2BMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(102,1.70);
        assertEquals(35.29, bmi, 0.2);
    }

    @Test
    public void obeseType3BMI() throws Exception {
        BMI objectBMI = new BMI();
        double bmi = objectBMI.getBMI(120,1.70);
        assertEquals(41.52, bmi, 0.2);
    }

}
