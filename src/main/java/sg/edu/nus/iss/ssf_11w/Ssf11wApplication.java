package sg.edu.nus.iss.ssf_11w;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ssf11wApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Ssf11wApplication.class);
		String port = "3000";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port"))
			port = cliOpts.getOptionValues("port").get(0);
		
		app.setDefaultProperties(
			Collections.singletonMap("server.port", port)
		);

		app.run(args);

	}

}
