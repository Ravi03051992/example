package com.ravi.registartion.system.userregistrationservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    private String email;
    private LocalDate dateOfBirth;
    private String mobileNumber;


}
