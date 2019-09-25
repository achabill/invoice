package com.achabill.invoice.controller;

import com.achabill.invoice.model.CreateUserResponse;
import com.achabill.invoice.model.JwtRequest;
import com.achabill.invoice.model.JwtResponse;
import com.achabill.invoice.model.User;
import com.achabill.invoice.service.SecurityService;
import com.achabill.invoice.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@Api("/users")
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final SecurityService securityService;

    @Autowired
    public UserController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder, SecurityService securityService) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.securityService = securityService;
    }

    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    @ApiOperation(value = "Signs up a new user", response = CreateUserResponse.class, tags = {"User"})
    public ResponseEntity<?> createUser(@RequestBody @Valid User user) throws Exception {
        String plainPassword = user.getPassword();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        User newUser = userService.save(user);
        JwtResponse jwtResponse = new JwtResponse(securityService.authenticate(newUser.getUsername(), plainPassword));
        return new ResponseEntity<>(new CreateUserResponse(user, jwtResponse), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Logs in a user", response = JwtResponse.class, tags = {"User"})
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody @Valid JwtRequest authenticationRequest) throws Exception {
        String token = securityService.authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        return ResponseEntity.ok(new JwtResponse(token));
    }
}
