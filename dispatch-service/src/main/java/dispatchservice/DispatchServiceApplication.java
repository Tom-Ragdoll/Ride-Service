package dispatchservice;

import dispatchservice.Interface.LocationServiceFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableHystrix
@EnableFeignClients(basePackageClasses = LocationServiceFeignClient.class)
@ComponentScan(basePackageClasses = LocationServiceFeignClient.class)
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class DispatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DispatchServiceApplication.class, args);
	}

}
