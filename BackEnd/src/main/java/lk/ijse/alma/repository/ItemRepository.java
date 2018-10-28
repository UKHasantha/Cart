package lk.ijse.alma.repository;

import lk.ijse.alma.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,String> {

}
