package Application.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Created by aliriano on 7/22/17.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user").password("password").roles("USER").build());

        return manager;
    }
    @Override
    //Ensures any request to our application requires user to be authenticated
    //Allows user to authenticate with form based login
    // Allows users to authenticate with HTTP basic authentication
    protected void configure(HttpSecurity http) throws Exception{
        http.
                authorizeRequests()
                    .antMatchers("/").permitAll() //permit everyone to home
                    .antMatchers("/post/create/**").hasRole("USER")
                    .antMatchers("/post/submit/**").hasRole("USER")
                    .antMatchers("/post/view/*").permitAll()
                    .antMatchers("/login").anonymous() //Only anonymous users should have access
                    .and()
                .formLogin()
                    .loginPage("/login")//Use supplied loginPage
                    .loginProcessingUrl("/login")
                .failureForwardUrl("/login/error")
                    .defaultSuccessUrl("/")
                .and()
                    .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));

    }

}
