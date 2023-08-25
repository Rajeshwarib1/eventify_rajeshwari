package com.eventify.POJO;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.Scanner;

public class PasswordEncoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        
        System.out.println("Original Password: " + password);
        System.out.println("Hashed Password: " + hashedPassword);
        
        scanner.close();
    }
}

