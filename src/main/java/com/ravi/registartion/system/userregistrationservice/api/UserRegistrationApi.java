package com.ravi.registartion.system.userregistrationservice.api;


import com.ravi.registartion.system.userregistrationservice.dto.EmailKeyDto;
import com.ravi.registartion.system.userregistrationservice.dto.UserDto;
import com.ravi.registartion.system.userregistrationservice.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserRegistrationApi {

    @Autowired
    private EmailKeyDto emailKeyDto;

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping
    public void register(@RequestBody UserDto userDto){
       this.userRegistrationService.register(userDto);
    }

    @GetMapping("/email")
    public EmailKeyDto reademailKeyDto(){
        return emailKeyDto;
    }
}
