package app.kanatovm.custom_initial_project_templates.config;

import com.vaadin.flow.spring.security.VaadinWebSecurity;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SecurityConfig.
 *
 * @author Kanatov Marat
 * Date: 15.05.2023
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@NoArgsConstructor
public class SecurityConfig extends VaadinWebSecurity {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((auth) -> {
                    auth.requestMatchers("/public/**").permitAll()
                        .requestMatchers("/assets/**").permitAll()
                        .requestMatchers("/images/*").permitAll()
                        .requestMatchers("/line-awesome/**").permitAll()
                        .requestMatchers("/actuator", "/actuator/**").permitAll()
                        .requestMatchers("/v3/**", "/swagger-ui*/**").permitAll();
                });

//        setLoginView(http, LoginView.class);
        super.configure(http);
    }

    @Override
    protected void configure(final WebSecurity web) throws Exception {
//         Do nothing
        super.configure(web);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
