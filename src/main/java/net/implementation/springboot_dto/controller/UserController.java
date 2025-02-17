package net.implementation.springboot_dto.controller;

import net.implementation.springboot_dto.dto.UserLocationDTO;
import net.implementation.springboot_dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/user-location")
    public List<UserLocationDTO> getAllUsersLocation()
    {
        return userService.getAllUsersLocation();
    }

}

//package net.implementation.springboot_dto.controller;
//
//import net.implementation.springboot_dto.dto.UserLocationDTO;
//import net.implementation.springboot_dto.model.User;
//import net.implementation.springboot_dto.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/user-location")
//    public List<UserLocationDTO> getAllUsersLocation() {
//        return userService.getAllUsersLocation();
//    }
//
//    @PostMapping
//    public ResponseEntity<User> createUser (@RequestBody User user) {
//        User createdUser  = userService.addUser (user);
//        return ResponseEntity.ok(createdUser );
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<User> updateUser (@PathVariable Long id, @RequestBody User user) {
//        User updatedUser  = userService.updateUser (id, user);
//        return ResponseEntity.ok(updatedUser );
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser (@PathVariable Long id) {
//        userService.deleteUser (id);
//        return ResponseEntity.noContent().build();
//    }
//}