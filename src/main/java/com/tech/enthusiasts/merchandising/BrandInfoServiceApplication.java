package com.tech.enthusiasts.merchandising;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.tech.enthusiasts.merchandising.entity.BrandInfoEntity;
import com.tech.enthusiasts.merchandising.service.BrandInfoService;

@SpringBootApplication
@EnableDiscoveryClient
public class BrandInfoServiceApplication implements CommandLineRunner {

	@Autowired
	private BrandInfoService brandInfoService;

	public static void main(String[] args) {
		SpringApplication.run(BrandInfoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final List<BrandInfoEntity> entities = Arrays.asList(new BrandInfoEntity(1L, "US POLO", "USA"),
				new BrandInfoEntity(2L, "LEE Cooper", "USA"), new BrandInfoEntity(3L, "GAP", "India"),
				new BrandInfoEntity(4L, "Manyavar", "India"));
		brandInfoService.addDummyData(entities);
	}

}