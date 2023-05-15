package WebServerDemo.ECommerceDemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ECommerceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceDemoApplication.class, args);
	}

	@Bean // Uygulama başladıktan sonra bu annotation IoC ye ekleneceğini gösterir.
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
