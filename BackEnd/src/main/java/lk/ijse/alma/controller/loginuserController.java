package lk.ijse.alma.controller;

import lk.ijse.alma.dto.UserDTO;
import lk.ijse.alma.service.userloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/loginuser")
public class loginuserController {

    @Autowired
    private userloginService userloginService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody UserDTO userDTO){
        return userloginService.canAuthenticate(userDTO.getUseremail(),userDTO.getUserpassword());
    }
}
