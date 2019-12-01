package io.subash.spring_security_ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@GetMapping("/")
	public String homePage() {
		return "<h1> Welcome to the home page, you have completed ldap authentication</h1>";
	}

}
