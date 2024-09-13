package payroll;

import org.apache.catalina.filters.CorsFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// class LoadDatabase {

// 	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

// 	@Bean
// 	CommandLineRunner initDatabase(EmployeeRepository repository) {

// 		return args -> {
// 			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
// 			log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
// 		};
// 	}
// }

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	private static final Logger log = LoggerFactory.getLogger(WebMvcConfig.class);

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
		};
	}

	// @Bean
	// public FilterRegistrationBean corsFilter() {
	// UrlBasedCorsConfigurationSource source = new
	// UrlBasedCorsConfigurationSource();
	// CorsConfiguration config = new CorsConfiguration();
	// config.setAllowCredentials(true);
	// config.addAllowedOrigin(CorsConfiguration.ALL);
	// config.addAllowedHeader(CorsConfiguration.ALL);
	// config.addAllowedMethod(CorsConfiguration.ALL); // 細かく設定可
	// source.registerCorsConfiguration("/*", config); // OAuth EP
	// source.registerCorsConfiguration("/*", config); // 個別設定
	// FilterRegistrationBean bean = new FilterRegistrationBean(new
	// CorsFilter(source));

	// bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	// return bean;
	// }
	// @Bean
	// public WebMvcConfigurer corsConfigurer() {
	// return new WebMvcConfigurer() {
	// @Override
	// public void addCorsMappings(final CorsRegistry registry) {
	// registry.addMapping("/**").allowedMethods("*").allowedHeaders("*");
	// }
	// };
	// }
}
