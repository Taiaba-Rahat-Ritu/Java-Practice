package com.example.invoice.Controller;

import com.example.invoice.Model.User;
import com.example.invoice.Services.UserService;
import java.util.List;
import com.itextpdf.text.DocumentException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getlAllUser() {
        return (List<User>) userService.getAll();

    }

    @GetMapping("/getUserByID/{id}")
    public Optional<User> getUserByID(@PathVariable("id") int id) throws DocumentException, FileNotFoundException {
        if (!userService.existsById(id)){
            throw new RuntimeException("User not found with ID: " +id);
        }
        return userService.getUserById(id);

    }



    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") int id, @RequestBody User user) {
        if (!userService.existsById(id)){
            throw new RuntimeException("User not found with ID: " +id);
        }
        //user.setUserID(id);
        return userService.save(user);
    }

    @DeleteMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") int id){
        if (!userService.existsById(id)){
            throw new RuntimeException("User not found with ID: " +id);
        }
        userService.deleteUserID(id);
        return "User deleted";

    }

    @ExceptionHandler({RuntimeException.class})
    public String exceptionHandler(RuntimeException exception){
        return exception.getMessage();
    }


}

