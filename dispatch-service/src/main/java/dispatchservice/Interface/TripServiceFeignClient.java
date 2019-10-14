package dispatchservice.Interface;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "trip-service")
public interface TripServiceFeignClient extends TripService{
}
