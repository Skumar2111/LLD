package main.java.com.example.park_sure.config;

import com.example.park_sure.security.JwtAuthFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class UserSecurityConfig {

    @Autowired
    JwtAuthFilter jwtAuthFilter;

/*    @Bean
    InMemoryUserDetailsManager inMemoryUserDetailsManager()
    {
        UserDetails john = User.builder().username("john").password("{noop}test123").roles("JE").build();
        UserDetails sus = User.builder().username("sus").password("{noop}test123").roles("SE").build();

        return new InMemoryUserDetailsManager(john,sus);
    }*/


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.GET,"/park-sure/**").hasAnyRole("JE","SE")
                                .requestMatchers(HttpMethod.POST,"/park-sure/**").hasAnyRole("SE")
                        .anyRequest().authenticated())
                        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
                        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }


}
