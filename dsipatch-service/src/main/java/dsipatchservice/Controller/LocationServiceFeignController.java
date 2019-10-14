package dsipatchservice.Controller;

import dsipatchservice.LocationServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;

public class LocationServiceFeignController {

    @Autowired
    private LocationServiceFeignClient locationServiceFeignClient;
}
