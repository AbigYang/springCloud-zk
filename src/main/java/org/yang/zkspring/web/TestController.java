package org.yang.zkspring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
public class TestController {

    @Value("${nickname1}")
    private String nickname1;

    @Value("${nickname2}")
    private String nickname2;

    @GetMapping("/test")
    private String test() {
        return nickname1;
    }


    @GetMapping("/test02")
    private String test02() {
        return nickname2;
    }

}
