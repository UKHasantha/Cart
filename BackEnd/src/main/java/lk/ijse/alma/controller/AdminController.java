package lk.ijse.alma.controller;

import lk.ijse.alma.dto.AdminDTO;
import lk.ijse.alma.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveAdmin(@RequestBody AdminDTO adminDTO){
        return adminService.saveAdmin(adminDTO);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<AdminDTO> getAllAdmins(){
        return adminService.getAllAdmins();
    }
    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteadmin(@PathVariable("id") String adminid){
        return adminService.deleteAdmin(adminid);
    }
}
