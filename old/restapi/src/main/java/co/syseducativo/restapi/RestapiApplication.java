package co.syseducativo.restapi;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import co.syseducativo.restapi.models.RoleModel;
import co.syseducativo.restapi.models.UserModel;
import co.syseducativo.restapi.services.UserService;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new RoleModel(null, "STUDENT"));
			userService.saveRole(new RoleModel(null, "TEACHER"));
			userService.saveRole(new RoleModel(null, "COORDINATOR"));
			userService.saveRole(new RoleModel(null, "ADMIN"));

			userService.saveUser(new UserModel(null, "sys_admin", "sys_admin123", new ArrayList<>()));

			userService.addRoleTouser("sys_admin", "ADMIN");
		};
	}

}
