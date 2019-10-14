package dispatchservice.Interface;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "location-service")
public interface LocationServiceFeignClient extends LocationService{
}
