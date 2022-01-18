package com.example.Sesion11SpringDeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest    asi solo ejecuta el test sin ejecutar Spring, mas rapido
class Sesion11SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key,value)->System.out.println(key+" "+value)
		);
	}

}
