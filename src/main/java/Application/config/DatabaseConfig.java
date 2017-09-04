package Application.config;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by aliriano on 9/4/17.
 */
@Configuration
public class DatabaseConfig {

    ResourceLoader resourceLoader = new DefaultResourceLoader();
    Resource resource = resourceLoader.getResource("SQL/test.sql");


    @Bean
    public DataSource dataSource(){
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setServerName("localhost");
        dataSource.setPortNumber(5432);
        dataSource.setDatabaseName("postgres");
        dataSource.setUser("postgres");
        dataSource.setPassword("password");

        return dataSource;
    }

//    @Bean
//    public ResourceDatabasePopulator resourceDatabasePopulator(){
//
//        ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//        resourceDatabasePopulator.addScript(resource);
//
//        return resourceDatabasePopulator;
//    }
//
//    @Bean
//    public DataSourceInitializer dataSourceInitializer(){
//
//        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//
//        dataSourceInitializer.setDataSource(dataSource());
//        //dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator());
//
//        return dataSourceInitializer;
//    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }




}
