package lk.ijse.alma.service;

import lk.ijse.alma.dto.UserDTO;
import lk.ijse.alma.entity.User;

import java.util.ArrayList;

public interface UserService {
    public ArrayList<UserDTO> getAllUsers();

    public UserDTO getUser(UserDTO userDTO);

    public boolean saveUser(UserDTO userDTO);

    public boolean deleteUser(int userID);

    public long getTotalUsers();

    public UserDTO searchCustomer(int id);
}
