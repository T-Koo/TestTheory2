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
		assertThat(user.getCode()).isEqualTo("1234");
	}
	
	@Test
	void 正常系_名前登録参照() {
		user.setName("東北タロウ");
		assertThat(user.getName()).isEqualTo("東北タロウ");
	}
	
	@Test
	void 正常系_年齢登録参照() {
		user.setAge(21);
		assertThat(user.getAge()).isEqualTo(21);
	}
	
	@Test
	void 異常系_範囲外年齢登録() {
		user.setAge(-20);
		assertThat(user.getAge()).isEqualTo(-1);
	}
	
	@Test
	void 異常系_年齢() {
		user.setAge(2000);
		assertThat(user.getAge()).isEqualTo(2000);
	}
	
	@AfterAll
	static void afterTest() {
		user = null;
	}
}
