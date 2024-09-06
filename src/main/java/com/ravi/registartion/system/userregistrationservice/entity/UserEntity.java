package com.ravi.registartion.system.userregistrationservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer userId;
    private String email;
    private LocalDate dateOfBirth;
    private String mobileNumber;
}
