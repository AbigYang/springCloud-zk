package org.yang.zkspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZkSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkSpringApplication.class, args);
    }

}
