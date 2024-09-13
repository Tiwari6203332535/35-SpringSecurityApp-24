package in.happy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filter(HttpSecurity http) throws Exception {

        System.out.println("Request filter executed");

        http
            .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/contect","greet").permitAll() // Replaced antMatchers with requestMatchers
                .anyRequest().authenticated())
                .formLogin(); // Uncomment if form-based login is needed

        return http.build();
    }
}
