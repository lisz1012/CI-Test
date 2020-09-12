package com.lisz.controller.service;

import com.lisz.service.MyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyServiceTest {
	@Autowired
	private MyService service;

	@Test
	public void testAdd(){
		Assertions.assertEquals(5, service.add(1, 2));
		System.out.println("哈哈哈，通过了！");
	}

}
