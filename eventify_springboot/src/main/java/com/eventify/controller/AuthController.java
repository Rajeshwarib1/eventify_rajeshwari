//package com.eventify.controller;
//
//import com.eventify.entity.User;
//import com.eventify.POJO.LoginRequest;
//import com.eventify.POJO.LoginResponse;
//import com.eventify.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.eventify.security.jwt.JwtTokenProvider;
//import com.eventify.POJO.JwtTokenProvider;
//
//
//@RestController
//public class AuthController {
//
//    private final AuthenticationManager authenticationManager;
//    private final UserDetailsService userDetailsService;
//    private final JwtTokenProvider jwtTokenProvider;
//    private final PasswordEncoder passwordEncoder;
//    private final CustomerService customerService;
//
//    @Autowired
//    public AuthController(AuthenticationManager authenticationManager,
//                          UserDetailsService userDetailsService,
//                          JwtTokenProvider jwtTokenProvider,
//                          PasswordEncoder passwordEncoder,
//                          CustomerService customerService) {
//        this.authenticationManager = authenticationManager;
//        this.userDetailsService = userDetailsService;
//        this.jwtTokenProvider = jwtTokenProvider;
//        this.passwordEncoder = passwordEncoder;
//        this.customerService = customerService;
//    }
//
//    @PostMapping("/api/auth/login")
//    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
//        // Authenticate the user
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
//        );
//
//        // Generate JWT token
//        UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
//        String token = jwtTokenProvider.generateToken(userDetails);
//
//        // Update user's last login time
//        customerService.updateLastLoginTime(loginRequest.getUsername());
//
//        // Return the token in the response
//        return ResponseEntity.ok(new LoginResponse(token));
//    }
//}
