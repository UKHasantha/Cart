package lk.ijse.alma.repository;

import lk.ijse.alma.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails,String> {
}
