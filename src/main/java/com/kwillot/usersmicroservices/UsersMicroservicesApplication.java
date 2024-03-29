package com.kwillot.usersmicroservices;

//import com.kwillot.usersmicroservices.entities.Role;
//import com.kwillot.usersmicroservices.entities.User;
//import com.kwillot.usersmicroservices.service.UserService;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UsersMicroservicesApplication {
//	@Autowired
//	UserService userService;
//	@PostConstructe
//	void init_users() {
//		//ajouter les rôles
//		userService.addRole(new Role(null,"ADMIN"));s
//		userService.addRole(new Role(null,"USER"));
//		//ajouter les users
//		userService.saveUser(new User(null,"admin","123",true,null));
//		userService.saveUser(new User(null,"nadhem","123",true,null));
//		userService.saveUser(new User(null,"yassine","123",true,null));
//		//ajouter les rôles aux users
//		userService.addRoleToUser("admin", "ADMIN");
//		userService.addRoleToUser("admin", "USER");
//		userService.addRoleToUser("nadhem", "USER");
//		userService.addRoleToUser("yassine", "USER");
//	}

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroservicesApplication.class, args);
	}
}
