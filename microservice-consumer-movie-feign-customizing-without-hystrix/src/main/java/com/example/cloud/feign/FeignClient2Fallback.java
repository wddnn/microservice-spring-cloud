package com.example.cloud.feign;

public class FeignClient2Fallback implements FeignClient2 {

	@Override
	public String findServiceInfoFromEurekaByServiceName(String serviceName) {
		// TODO Auto-generated method stub
		return "haha";
	}

}
