package lk.ijse.alma.repository;

import lk.ijse.alma.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Integer> {

}
