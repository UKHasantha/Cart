package lk.ijse.alma.service.impl;

import lk.ijse.alma.dto.UserDTO;
import lk.ijse.alma.entity.User;
import lk.ijse.alma.repository.UserRepository;
import lk.ijse.alma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ArrayList<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        ArrayList<UserDTO> allUsers = new ArrayList<>();
        for (User user : userList) {
            UserDTO userDTO = new UserDTO(user.getUserID(), user.getUserimage(), user.getUserfname(), user.getUserlname(),
                    user.getUseremail(), user.getUseraddress(), user.getUserbday(), user.getUserpassword());
            allUsers.add(userDTO);
        }
        return allUsers;
    }

    @Override
    public UserDTO getUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public boolean saveUser(UserDTO userDTO) {
        User user = new User(userDTO.getUserID(), userDTO.getUserimage(), userDTO.getUserfname(), userDTO.getUserlname(),
                userDTO.getUseremail(), userDTO.getUseraddress(), userDTO.getUserbday(), userDTO.getUserpassword());
        userRepository.save(user);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteUser(int userID) {
        User user = userRepository.findById(userID).get();
        if (user!=null){
            userRepository.delete(user);
        }
        return true;
    }

    @Override
    public long getTotalUsers() {
        return 0;
    }

    @Override
    public UserDTO searchCustomer(int id) {
        Optional<User> byID=userRepository.findById(id);
        User user=byID.get();
        UserDTO userDTO = new UserDTO(user.getUserID(),user.getUserimage(),user.getUserfname(),user.getUserlname(),user.getUseremail(),
                user.getUseraddress(),user.getUserbday(),user.getUserpassword());
        return userDTO;
    }

}
