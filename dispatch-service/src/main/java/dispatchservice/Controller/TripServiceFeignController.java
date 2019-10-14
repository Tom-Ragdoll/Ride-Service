package dispatchservice.Controller;

import dispatchservice.Interface.TripServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;

public class TripServiceFeignController
{
    @Autowired
    private TripServiceFeignClient tripServiceFeignClient;
}
