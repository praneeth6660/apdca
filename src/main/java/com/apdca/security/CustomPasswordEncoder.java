package com.apdca.security;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.core.token.Sha512DigestUtils;
import org.springframework.security.crypto.password.PasswordEncoder;




public class CustomPasswordEncoder implements PasswordEncoder{

	@Override
	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		return DigestUtils.sha256Hex(rawPassword.toString().getBytes());
		
		//return Sha512DigestUtils.shaHex(rawPassword.toString().getBytes());
	}

	 @Override
	    public boolean matches(CharSequence rawPassword, String encodedPassword) {
	        String rawEncoded = encode(rawPassword);
	        return Objects.equals(rawEncoded, encodedPassword);
	    }
	 
	public static void main(String[] args) {
		CustomPasswordEncoder customPasswordEncoder=new CustomPasswordEncoder();
		String encodePassword=customPasswordEncoder.encode(customPasswordEncoder.encode("ADMIN@ap555"));
		System.out.println("encodePassword---->"+encodePassword);
	}

}
