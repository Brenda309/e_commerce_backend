package com.e.commerce.backend.registration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class RegistrationController {
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) throws IllegalAccessException{
        return registrationService.register(request);
    }

    @GetMapping(path="cnfirm")
    public String confirm (@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }
}
