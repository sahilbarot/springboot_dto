////package net.implementation.springboot_dto;
////
////import net.implementation.springboot_dto.model.Location;
////import net.implementation.springboot_dto.repository.LocationRepository;
////import net.implementation.springboot_dto.repository.UserRepository;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.CommandLineRunner;
////import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
////
////@SpringBootApplication
////public class SpringbootDtoApplication implements CommandLineRunner {
////
////	public static void main(String[] args)
////	{
////
////		SpringApplication.run(SpringbootDtoApplication.class, args);
////
////		@Autowired
////		private UserRepository userRepository;
////
////		@Autowired
////				private LocationRepository locationRepository
////
////	}
////
////	@Override
////	public void run(String... args) throws Exception {
////
////		Location location = new Location();
////
////	}
////}
//
package net.implementation.springboot_dto;

import net.implementation.springboot_dto.model.Location;
import net.implementation.springboot_dto.model.User;
import net.implementation.springboot_dto.repository.LocationRepository;
import net.implementation.springboot_dto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstname("Ramesh");
		user1.setLastname("Fadatare");
		user1.setEmail("ramesh@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstname("John");
		user2.setLastname("Cena");
		user2.setEmail("john@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	}
}

//package net.implementation.springboot_dto;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringbootDtoApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringbootDtoApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		// No initial data setup needed here
//	}
//}