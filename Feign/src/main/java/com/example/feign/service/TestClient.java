package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 这里的 eureka-client 即其他注册到 EurekaServer 中的服务
// 本应用自身作为一个 EurekaClient，会从 EurekaServer 中拉取 eureka-client 这个服务的信息
@FeignClient("eureka-client")
public interface TestClient {
    // 调用 eureka-client 服务的 / 接口
    @GetMapping("/")
    String testFeign();
}
