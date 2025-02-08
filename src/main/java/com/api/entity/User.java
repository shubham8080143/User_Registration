package com.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {
   
	
	private String name;
	private String username;
	private String email;
	
	@Id
	private Long phone;
	private String password;
	private String cpassword;
	private String gender;
}
