package lk.ijse.alma.service.impl;

import lk.ijse.alma.entity.User;
import lk.ijse.alma.repository.UserRepository;
import lk.ijse.alma.service.userloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userloginServiceImpl implements userloginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean canAuthenticate(String useremail, String userpassword) {
        List<User> all = userRepository.findAll();
        boolean res = false;
        for (User user : all) {
            if (user.getUseremail().equals(useremail)) {
                if (user.getUserpassword().equals(userpassword)) {
                    res = true;
                }
            }
        }
        return res;
    }
}
