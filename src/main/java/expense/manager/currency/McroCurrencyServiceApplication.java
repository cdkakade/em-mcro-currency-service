package expense.manager.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class McroCurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(McroCurrencyServiceApplication.class, args);
	}

}
