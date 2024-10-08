package com.example.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter/setter
@NoArgsConstructor //기본생성자->User()(클래스는 기본생성자를 만들지 않아도 자동으로 만들어지지만 다른 생성자가 생길 경우 해당 자동으로 만들어지지 않으므로 따로 다시 만들어줘야 한다. 
@AllArgsConstructor //모든 메개변수를 생성자로->User(모든 메개변수)
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; //회원번호
	
	@Column(length = 50, nullable = false, unique = true)
	private String username; //회원아이디
	
	@Column(length = 100, nullable = false)
	private String password;
	
	private String email;
}
