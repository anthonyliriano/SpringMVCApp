package Application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * Created by aliriano on 7/14/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "Application")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        //Set prefix
        resolver.setPrefix("/WEB-INF/views/");

        //Set suffix
        resolver.setSuffix(".jsp");

        resolver.setExposeContextBeansAsAttributes(true);

        return resolver;
    }

    @Bean
    public StandardServletMultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //Map external resource
        registry
                .addResourceHandler("/user_images/**")
                .addResourceLocations("file:"+System.getProperty("user.home")+"/user_avatars/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }

}
