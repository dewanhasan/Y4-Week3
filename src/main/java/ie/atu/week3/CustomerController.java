package ie.atu.week3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("/customer")
    public String CustomerData(@RequestBody CustomerDetails customerDetails) {
        String message = "Name: " + customerDetails.getName() + ", Email: " + customerDetails.getEmail();
        return message;
    }
}
