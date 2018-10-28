package lk.ijse.alma.service.impl;

import lk.ijse.alma.entity.User;
import lk.ijse.alma.repository.UserRepository;
import lk.ijse.alma.service.userloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userloginServiceImpl implements userloginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean canAuthenticate(String useremail, String userpassword) {

        boolean exists = userRepository.existsById(Integer.parseInt(useremail));
        if (!exists){
            return false;
        }

        User user = userRepository.findById(Integer.parseInt(useremail)).get();
        return user.getUserpassword().equals(userpassword);

    }
}
