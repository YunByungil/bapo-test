package com.example.bapo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BapoApplicationTests {

	@Test
	void contextLoads() {
		if (1 == 1) { // 실패하는 테스트
			throw new IllegalArgumentException();
		}
	}

}
