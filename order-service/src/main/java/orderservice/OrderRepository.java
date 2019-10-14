package orderservice;

import orderservice.Model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends
        CrudRepository<Order, Long> {
}
