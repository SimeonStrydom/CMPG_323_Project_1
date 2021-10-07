package za.ac.nwu.translator.config;


import config.RepositoryConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RepositoryConfig.class})
@Configuration
public class TranslatorConfig {
}
