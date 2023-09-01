package timurka.netology.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import timurka.netology.demo.profile.SystemProfile;

@RestController
@RequestMapping("/")
public class Controller {
    private final SystemProfile profile;

    public Controller(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}