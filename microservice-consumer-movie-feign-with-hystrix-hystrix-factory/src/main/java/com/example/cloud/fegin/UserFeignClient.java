package com.example.cloud.fegin;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.cloud.entity.User;


@FeignClient(name = "microservice-provider-user",fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {
	@RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id);
}
