package name.cyh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class SonarQubeController {
    @GetMapping("hello")
    public String hello() {
        if (true) {
            System.out.println("hello");
        }
        return String.valueOf(System.currentTimeMillis());
    }
}
