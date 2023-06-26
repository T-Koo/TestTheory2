package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserTest {
	static User user = null;
	@BeforeAll
	static void beforeTest() {
		user = new User(null);
	}
	
	@Test
	void 正常系_ユーザー管理コード登録参照() {
		user.setCode("1234");
		assertThat("1234").isEqualTo(user.getCode());
	}
	
	@Test
	void 正常系_名前登録参照() {
		user.setName("東北タロウ");
		assertThat("東北タロウ").isEqualTo(user.getName());
	}
	
	@Test
	void 正常系_年齢登録参照() {
		user.setAge(21);
		assertThat(21).isEqualTo(user.getAge());
	}
	
	@Test
	void 異常系_範囲外年齢登録() {
		user.setAge(-20);
		assertThat(-1).isEqualTo(user.getAge());
	}
	
	@Test
	void 異常系_年齢() {
		
	}
	
	@AfterAll
	static void afterTest() {
		user = null;
	}
}
