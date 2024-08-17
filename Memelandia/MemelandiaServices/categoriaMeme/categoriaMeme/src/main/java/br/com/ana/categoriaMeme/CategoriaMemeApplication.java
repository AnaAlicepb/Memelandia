package br.com.ana.categoriaMeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableDiscoveryClient
@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.cfarias.categoriaMeme.repository")
public class CategoriaMemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriaMemeApplication.class, args);
	}

}
