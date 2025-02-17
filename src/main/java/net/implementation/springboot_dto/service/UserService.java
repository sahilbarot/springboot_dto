package net.implementation.springboot_dto.service;

import net.implementation.springboot_dto.dto.UserLocationDTO;
import net.implementation.springboot_dto.model.User;
import net.implementation.springboot_dto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation()
    {
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertEntityToDto(User user)
    {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());

        return userLocationDTO;
    }
}

//package net.implementation.springboot_dto.service;
//
//import net.implementation.springboot_dto.dto.UserLocationDTO;
//import net.implementation.springboot_dto.model.User;
//import net.implementation.springboot_dto.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<UserLocationDTO> getAllUsersLocation() {
//        return userRepository.findAll()
//                .stream()
//                .map(this::convertEntityToDto)
//                .collect(Collectors.toList());
//    }
//
//    public User addUser (User user) {
//        return userRepository.save(user);
//    }
//
//    public User updateUser (Long id, User userDetails) {
//        Optional<User> optionalUser  = userRepository.findById(id);
//        if (optionalUser .isPresent()) {
//            User user = optionalUser .get();
//            user.setFirstname(userDetails.getFirstname());
//            user.setLastname(userDetails.getLastname());
//            user.setEmail(userDetails.getEmail());
//            user.setPassword(userDetails.getPassword());
//            user.setLocation(userDetails.getLocation());
//            return userRepository.save(user);
//        } else {
//            throw new RuntimeException("User  not found with id " + id);
//        }
//    }
//
//    public void deleteUser (Long id) {
//        if (!userRepository.existsById(id)) {
//            throw new RuntimeException("User  not found with id " + id);
//        }
//        userRepository.deleteById(id);
//    }
//
//    private UserLocationDTO convertEntityToDto(User user) {
//        UserLocationDTO userLocationDTO = new UserLocationDTO();
//        userLocationDTO.setUserId(user.getId());
//        userLocationDTO.setEmail(user.getEmail());
//        userLocationDTO.setPlace(user.getLocation().getPlace());
//        userLocationDTO.setLongitude(user.getLocation().getLongitude());
//        userLocationDTO.setLatitude(user.getLocation().getLatitude());
//        return userLocationDTO;
//    }
//}







