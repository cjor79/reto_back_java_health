package co.com.sofka.javahealth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthStatusTest {
    @Test
    public void statusSevereThinness() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(15.0);
        String status = statusBMI.get();
        assertEquals("Underweight: Severe thinness",status);
    }

    @Test
    public void statusModerateThinness() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(16.5);
        String status = statusBMI.get();
        assertEquals("Underweight: Moderate thinness",status);
    }

    @Test
    public void statusAcceptableThinness() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(17.5);
        String status = statusBMI.get();
        assertEquals("Underweight: Acceptable thinness",status);
    }

    @Test
    public void statusNormal() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(22.5);
        String status = statusBMI.get();
        assertEquals("Normal weight",status);
    }

    @Test
    public void statusOverweight() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(28.5);
        String status = statusBMI.get();
        assertEquals("Overweight",status);
    }

    @Test
    public void statusObeseType1() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(32.5);
        String status = statusBMI.get();
        assertEquals("Obese: Type I",status);
    }

    @Test
    public void statusObeseType2() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(36.5);
        String status = statusBMI.get();
        assertEquals("Obese: Type II",status);
    }

    @Test
    public void statusObeseType3() throws Exception{
        HealthStatusFactory statusFactory = new HealthStatusFactory();
        HealthStatus statusBMI = statusFactory.getStatus(43.5);
        String status = statusBMI.get();
        assertEquals("Obese: Type III",status);
    }

    @Test
    public void getNormalWeight() throws Exception{
        BMI objectBMI = new BMI();
        Double normalWeight = objectBMI.getNormalWeight(80,1.70);
        assertEquals(72,normalWeight,0.2);
    }
}
