package config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("za.ac.nwu.Database.queries")
@EntityScan("za.ac.nwu.domain.entities")
@PropertySource(value = "classpath:application.properties")
public class RepositoryConfig {

}
