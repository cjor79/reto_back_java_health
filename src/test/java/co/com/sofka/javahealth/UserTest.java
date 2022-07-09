package co.com.sofka.javahealth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.json.simple.JSONObject;
import java.util.HashMap;


 class UserTest {
    @Test
     void userBMI() throws Exception{
        User user = new User(27, 'm', 78.5, 1.7);
        assertEquals(27.16262975778547,user.getBMI(),"BMI");
    }

    @Test
    void userBFI() throws Exception{
        User user = new User(27, 'm', 78.5, 1.7);
        assertEquals(22.60515570934256,user.getBFI(),"BFI");
    }

    @Test
    void userStatus() throws Exception{
        User user = new User(27, 'm', 78.5, 1.7);
        assertEquals("Overweight",user.getStatus(),"Health status");
    }

    @Test
    void userNormalWeight() throws Exception{
        User user = new User(27, 'm', 78.5, 1.7);
        assertEquals(71.5,user.getNormalWeight(),"Healthy weight");
    }

    @Test
    void userHealthReport() throws Exception{
        User user = new User(27, 'm', 78.5, 1.7);
        HashMap<String,Object> report = new HashMap<>();
        report.put("status", "Overweight");
		report.put("healthyWeight", 71.5);
		report.put("bmi", 27.16262975778547);
		report.put("bfi", 22.60515570934256);
        JSONObject expectedReport = new JSONObject(report);
        assertEquals(expectedReport,user.getReport(),"User health report");
    }
}