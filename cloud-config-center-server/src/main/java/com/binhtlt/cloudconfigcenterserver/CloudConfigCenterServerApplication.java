package com.binhtlt.cloudconfigcenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigCenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigCenterServerApplication.class, args);
	}

}
