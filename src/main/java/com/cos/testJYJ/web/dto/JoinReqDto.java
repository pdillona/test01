package com.cos.testJYJ.web.dto;

import com.cos.testJYJ.dimain.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class JoinReqDto {

		private String username;
		private String password;
		private String email;

		
		public User toEntity() {
			
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			return user;
			
		}
		
		
}
