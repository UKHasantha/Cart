package lk.ijse.alma.service.impl;

import lk.ijse.alma.dto.AdminDTO;
import lk.ijse.alma.dto.UserDTO;
import lk.ijse.alma.entity.Admin;
import lk.ijse.alma.repository.AdminRepository;
import lk.ijse.alma.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public ArrayList<AdminDTO> getAllAdmins() {
        return null;
    }

    @Override
    public AdminDTO getAdmin(AdminDTO adminid) {
        return null;
    }

    @Override
    public boolean saveAdmin(AdminDTO adminDTO) {
        Admin admin=new Admin(adminDTO.getAdminID(),adminDTO.getAdminname(),adminDTO.getAdminemail(),
                adminDTO.getAdminpassword());
        adminRepository.save(admin);
        return true;
    }

    @Override
    public boolean deleteAdmin(String adminid) {
        return false;
    }

    @Override
    public long getTotalAdmins() {
        return 0;
    }

    @Override
    public UserDTO searchAdmin(String adminid) {
        return null;
    }
}
