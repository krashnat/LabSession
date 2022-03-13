package com.gl.service;

import java.util.Random;

public class CredentialService {

	public String generatePassword() {

		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi!@#$%&" + "jklmnopqrstuvwxyz" + "!@#$%&";

		int len = 7;
		Random rnd = new Random();
		StringBuilder password = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			password.append(chars.charAt(rnd.nextInt(chars.length())));
		return password.toString();
	}

	public String generateEmailAddress(String firstName, String lastName, String tech) {
		return firstName + lastName + "@" + tech + ".sag.com";
	}

}
