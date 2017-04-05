package io.delivery.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/secure").access("hasRole('ADMIN')")
                .antMatchers("/create").access("hasRole('USER')")
                .antMatchers("/insert").access("hasRole('USER2')")
                .antMatchers("/update").access("hasRole('USER3')")
                .antMatchers("/delete").access("hasRole('USER4')")
                .and().csrf().disable().formLogin().defaultSuccessUrl("/", false);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
        auth.inMemoryAuthentication().withUser("user2").password("user2").roles("USER2");
        auth.inMemoryAuthentication().withUser("user3").password("user3").roles("USER3");
        auth.inMemoryAuthentication().withUser("user4").password("user4").roles("USER4");
    }
}
