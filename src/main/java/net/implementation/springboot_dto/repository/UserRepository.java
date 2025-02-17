package net.implementation.springboot_dto.repository;

import net.implementation.springboot_dto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

//package net.implementation.springboot_dto.repository;
//
//import net.implementation.springboot_dto.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface UserRepository extends JpaRepository<User, Long> {
//}