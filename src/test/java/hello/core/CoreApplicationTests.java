package hello.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages =  "hello.core")
class CoreApplicationTests {

	@Test
	void contextLoads() {
	}

}
