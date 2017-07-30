package Application;

import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * Created by aliriano on 7/18/17.
 */
public class Application {

    public static int Port =  Integer.parseInt(System.getenv("PORT"));

    public static void main(String[] args) throws Exception {
        String webAppDirLocation = "src/main/";
        Tomcat tomcat = new Tomcat();

        //Heroku should provide port.
        if (Application.Port <= 0){
            Application.Port = 8080;
        }
        tomcat.setPort(Application.Port);

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webAppDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();

    }

}
