package expense.manager.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"expense.manager.common", "expense.manager.currency"})
public class McroCurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(McroCurrencyServiceApplication.class, args);
	}

}
