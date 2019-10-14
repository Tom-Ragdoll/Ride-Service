package dsipatchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableHystrix
@EnableFeignClients(basePackageClasses = LocationServiceFeignClient.class)
@ComponentScan(basePackageClasses = LocationServiceFeignClient.class)
@EnableDiscoveryClient
@SpringBootApplication
public class DsipatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsipatchServiceApplication.class, args);
	}

}
