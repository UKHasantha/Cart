package lk.ijse.alma.controller;

import lk.ijse.alma.dto.UserDTO;
import lk.ijse.alma.entity.User;
import lk.ijse.alma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveUser(@RequestBody UserDTO user){
        return userService.saveUser(user);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping(value = "/{userID}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteUser(@PathVariable("userID") int userID) {
        return userService.deleteUser(userID);
    }


}
