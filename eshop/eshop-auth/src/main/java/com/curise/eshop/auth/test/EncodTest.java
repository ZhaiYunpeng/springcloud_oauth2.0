package com.curise.eshop.auth.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Administrator
 */
public class EncodTest {
    public static void main(String[] args) {
        System.out.println(encode("123456"));
    }

    public static String encode(String password){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(password);
    }
}
