package com.ravi.registartion.system.userregistrationservice.service;

import com.ravi.registartion.system.userregistrationservice.dto.UserDto;
import com.ravi.registartion.system.userregistrationservice.entity.UserEntity;
import com.ravi.registartion.system.userregistrationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(UserDto userDto) {
        UserEntity userEntity = UserEntity.builder()
                                .email(userDto.getEmail())
                                .dateOfBirth(userDto.getDateOfBirth())
                                .mobileNumber(userDto.getMobileNumber())
                                .build();

        userRepository.save(userEntity);

    }
}
