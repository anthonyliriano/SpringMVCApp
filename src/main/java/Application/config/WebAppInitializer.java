package Application.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import java.io.File;

/**
 * Created by aliriano on 7/17/17.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private int maxUploadSizeInMb = 5 * 1024 * 1024; //5MB

    @Override
    protected String[] getServletMappings(){
        return new String[]{ "/" };
    }

    @Override // Gets  ApplicationContext by the ContextListener
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ RootConfig.class, WebSecurityConfig.class };
    }

    @Override  // Gets ApplicationContext from DispatacherServlet w/ defined beans from WebConfig Class..
    protected Class<?>[] getServletConfigClasses(){
        return new Class[]{ WebConfig.class };
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration){

        //Temporary location where files will be placed
        File uploadDirectory = new File("/user_avatars/");

        MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
                maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);


        registration.setMultipartConfig(multipartConfigElement);
    }
}
