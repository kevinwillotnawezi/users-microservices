package com.kwillot.usersmicroservices.restControllers;

import com.kwillot.usersmicroservices.entities.User;
import com.kwillot.usersmicroservices.service.UserService;
import com.kwillot.usersmicroservices.service.exceptions.ErrorDetails;
import com.kwillot.usersmicroservices.service.exceptions.ExpiredTokenException;
import com.kwillot.usersmicroservices.service.exceptions.InvalidTokenException;
import com.kwillot.usersmicroservices.service.register.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
    @Autowired
    UserService userService;
    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("/register")
    public User register(@RequestBody RegistrationRequest request)
    {
        return userService.registerUser(request);
    }

    @GetMapping("/verifyEmail/{token}")
    public User verifyEmail(@PathVariable("token") String token){
        return userService.validateToken(token);
    }

    @ExceptionHandler(InvalidTokenException.class)
    public ResponseEntity<ErrorDetails> handleInvalidTokenException(InvalidTokenException exception, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "INVALID_TOKEN"
        );
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ExpiredTokenException.class)
    public ResponseEntity<ErrorDetails> handleExpiredTokenException(ExpiredTokenException exception,
                                                                    WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "EXPIRED_TOKEN"
        );
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
}