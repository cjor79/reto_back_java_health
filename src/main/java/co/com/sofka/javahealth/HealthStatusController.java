package co.com.sofka.javahealth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;

@RestController
@CrossOrigin(origins = "*")
public class HealthStatusController {

    @PostMapping("/bmi")
    public double getBMI(@RequestBody User user) {
        return user.getBMI();
    }

    @PostMapping("/bfi")
    public double getBFI(@RequestBody User user) {
        return user.getBFI();
    }

    @PostMapping("/")
    public JSONObject getHealthStatus(@RequestBody User user){
        return user.getReport();
    }

}
