package com.jony.test.helloclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker
public class HelloClientApplication {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	/*@FeignClient(value="HELLO-SERVER",fallback=ComputeClientHystrix.class )
	public interface ComputeClient {

	    @RequestMapping(method = RequestMethod.GET, value = "/add")
	    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

	}*/
	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}
}
