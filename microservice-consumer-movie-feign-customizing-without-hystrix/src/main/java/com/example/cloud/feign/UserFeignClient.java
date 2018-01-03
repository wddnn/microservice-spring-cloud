package com.example.cloud.feign;


import org.springframework.cloud.netflix.feign.FeignClient;

import com.example.cloud.entity.User;
import com.example.config.Configuration1;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "microservice-provider-user", configuration = Configuration1.class,   fallback = HystrixClientFallback.class )
public interface UserFeignClient {
  @RequestLine("GET /simple/{id}")
  public User findById(@Param("id") Long id);
}
