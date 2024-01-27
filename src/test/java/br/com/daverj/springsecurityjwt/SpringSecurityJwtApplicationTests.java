package br.com.daverj.springsecurityjwt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityJwtApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void Test() {
		System.out.println(new BCryptPasswordEncoder().encode("admin@security"));
	}

}
