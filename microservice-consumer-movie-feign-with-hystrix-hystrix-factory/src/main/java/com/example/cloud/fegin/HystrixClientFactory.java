package com.example.cloud.fegin;



import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.example.cloud.entity.User;

import feign.hystrix.FallbackFactory;
@Component
public class HystrixClientFactory implements FallbackFactory<UserFeignClient> {

	private static final Logger logger =LoggerFactory.getLogger(HystrixClientFactory.class);

	@Override
	public UserFeignClient create(Throwable cause) {
		HystrixClientFactory.logger.info("fallback; reason was: {}", cause.getMessage());
		return new UserFeignClientWithFactory() {

			@Override
			public User findById(Long id) {
				User user = new User();
				user.setId(-1L);
				return user;
			}
		};
	}




}
