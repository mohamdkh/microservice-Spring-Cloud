package ehtp.medkh;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import ehtp.medkh.dao.CompanyRepository;
import ehtp.medkh.entities.company;
@EnableDiscoveryClient
@SpringBootApplication
public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompanyRepository repos) {
		return arg->{
			Stream.of("Company A","Company B","Company C").forEach(elem->{
				repos.save(new company(0, elem, 100+ Math.random()*900));
			});
			repos.findAll().forEach(System.out::println);
		};
		
	}

}
