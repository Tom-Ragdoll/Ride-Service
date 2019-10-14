package dispatchservice.Controller;

import dispatchservice.Interface.LocationServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;

public class LocationServiceFeignController {

    @Autowired
    private LocationServiceFeignClient locationServiceFeignClient;
}
