package dsipatchservice.Controller;

import dsipatchservice.TripServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;

public class TripServiceFeignController
{
    @Autowired
    private TripServiceFeignClient tripServiceFeignClient;
}
