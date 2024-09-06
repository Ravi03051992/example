package com.ravi.registartion.system.userregistrationservice.dto;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "email.key")
@Data
public class EmailKeyDto {

    private String apiKey;
    private String clientSecret;

}
