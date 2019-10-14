package dispatchservice.Interface;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "order-service")
public interface OrderServiceFeignClient extends OrderService{
}
