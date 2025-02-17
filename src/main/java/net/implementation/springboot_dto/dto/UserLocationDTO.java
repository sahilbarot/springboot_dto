package net.implementation.springboot_dto.dto;


//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data

public class UserLocationDTO
{
    private long userId;
    private String email;
    private String place;
    private Double longitude;
    private Double latitude;
}


//package net.implementation.springboot_dto.dto;
//
//import lombok.Data;
//
//@Data
//public class UserLocationDTO {
//    private long userId;
//    private String email;
//    private String place;
//    private Double longitude;
//    private Double latitude;
//}