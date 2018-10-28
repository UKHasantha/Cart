package lk.ijse.alma.service;

import lk.ijse.alma.dto.AdminDTO;
import lk.ijse.alma.dto.UserDTO;

import java.util.ArrayList;

public interface AdminService {
    public ArrayList<AdminDTO> getAllAdmins();
    public AdminDTO getAdmin(AdminDTO adminid);
    public boolean saveAdmin(AdminDTO adminDTO);
    public boolean deleteAdmin(String adminid);
    public long getTotalAdmins();
    public UserDTO searchAdmin(String adminid);
}
