package orderservice.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import orderservice.Model.Order;
import orderservice.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(value="/orders", method= RequestMethod.POST)
    public ResponseEntity<Order> create(
            @RequestBody(required = true) Order inputOrder) {

        Order order = new Order(inputOrder.tripId,
                inputOrder.status);

        orderRepository.save(order);

        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @HystrixCommand(fallbackMethod = "defaultOrders")
    @RequestMapping(value="/orders", method=RequestMethod.GET)
    public ResponseEntity<List<Order>> getAll(){

        List<Order> orders = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(orders::add);

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    public ResponseEntity<List<Order>> defaultOrders() {
        List<Order> orders = new ArrayList<>();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
    public ResponseEntity<Order> get(@PathVariable("id") String id) {

        Order order = null;
        Optional<Order> optional = null;

        try {
            optional = orderRepository.findById(Long.parseLong(id));
        }catch(Exception ex){

        }

        if(optional == null || !optional.isPresent()){
            return new ResponseEntity<>(order, HttpStatus.NOT_FOUND);
        }

        order = optional.get();

        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @RequestMapping(value="/orders/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Order> update(@PathVariable("id") String id,
                                        @RequestBody(required = true) Order inputOrder) {

        Order order = null;
        Optional<Order> optional = orderRepository.findById(Long.parseLong(id));

        if(!optional.isPresent()){
            return new ResponseEntity<>(order, HttpStatus.NOT_FOUND);
        }

        if(optional.get().id != inputOrder.id){
            return new ResponseEntity<>(order, HttpStatus.BAD_REQUEST);
        }

        // Keep the original createdAt time
        order = new Order(Long.parseLong(id),
                inputOrder.tripId,
                inputOrder.status,
                optional.get().createdAt);

        orderRepository.save(order);

        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}


