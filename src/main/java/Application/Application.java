package Application;

import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

/**
 * Created by aliriano on 7/18/17.
 */
@ComponentScan(basePackages = "Application")
public class Application {

    public static void main(String[] args) throws Exception {
        String webAppDirLocation = "src/main/";
        Tomcat tomcat = new Tomcat();

        //Set Port #
        tomcat.setPort(8080);

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webAppDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();

    }

}
