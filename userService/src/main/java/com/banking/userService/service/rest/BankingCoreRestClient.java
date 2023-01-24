package com.banking.userService.service.rest;

import com.banking.userService.configuration.CustomFeignClientConfiguration;
import com.banking.userService.model.rest.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "CORE-BANKING-SERVICE", configuration = CustomFeignClientConfiguration.class)
public interface BankingCoreRestClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/user/{identification}")
    UserResponse readUser(@PathVariable("identification") String identification);

}
