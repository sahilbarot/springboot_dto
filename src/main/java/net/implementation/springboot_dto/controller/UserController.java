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
