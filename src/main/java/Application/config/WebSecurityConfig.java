package Application.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by aliriano on 7/22/17.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user").password("admin").roles("USER").build());

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
                    .anyRequest().authenticated() //Any other request must be autheticated
                    .and()
                .formLogin()
                    .loginPage("/login")//Use supplied loginPage
                    .permitAll(); // permit everyone to the loginPage
    }

}
