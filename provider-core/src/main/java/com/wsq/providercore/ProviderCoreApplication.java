package com.wsq.providercore;

import com.wsq.common.serviceStandard.ServiceStandard;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ServiceStandard
@ComponentScan(basePackages = {"com.wsq"})
public class ProviderCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderCoreApplication.class, args);
	}
}
