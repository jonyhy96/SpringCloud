package com.jony.test.helloclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jony.test.helloclient.HelloClientApplication.ComputeClient;

@RestController
public class CustomerController {
	
	 @Autowired
	    ComputeClient computeClient;

	    @RequestMapping(value = "/add", method = RequestMethod.GET)
	    public Integer add() {
	        return computeClient.add(10, 20);
	    }
	
	/*@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String add() {
		return restTemplate.getForEntity("http://HELLO-SERVER/add?a=10&b=20", String.class).getBody();
		
	}*/
}
