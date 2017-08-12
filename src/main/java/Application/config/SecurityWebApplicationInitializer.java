package Application.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.multipart.support.MultipartFilter;

import javax.servlet.ServletContext;

/**
 * Created by aliriano on 7/22/17.
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer{

    @Override //Allow the ability to process multipart/form-data
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext){
        insertFilters(servletContext, new MultipartFilter());
    }
}
