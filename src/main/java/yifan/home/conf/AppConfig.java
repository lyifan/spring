package yifan.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.apache.log4j.Logger;

@Configuration
public class AppConfig {
	
	@Bean(name="logger")
	public Logger buildLogger() {
		return Logger.getLogger("home.spring");
	}
	
}
