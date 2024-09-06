package com.ravi.registartion.system.userregistrationservice.repository;

import com.ravi.registartion.system.userregistrationservice.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
