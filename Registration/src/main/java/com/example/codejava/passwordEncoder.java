package com.example.codejava;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordEncoder {

	public static void main(String[] args) {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	String rawpass = "qu5UmtJ5@";
	String encoderpass = encoder.encode(rawpass);
	System.out.println(encoderpass);
	}

}
