package com.example.cloud.feign;

import com.example.cloud.entity.User;

public class HystrixClientFallback implements UserFeignClient {

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(0L);
		return user;
	}

}
